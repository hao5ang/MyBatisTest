CREATE TABLE demo
(
  id bigint NOT NULL, -- id
  type smallint NOT NULL, -- type
  remark character varying(60), -- desc
  CONSTRAINT pk_id_type PRIMARY KEY (id, type)
);

ALTER TABLE demo
  OWNER TO postgres;
COMMENT ON COLUMN demo.id IS 'id';
COMMENT ON COLUMN demo.type IS 'type';
COMMENT ON COLUMN demo.remark IS 'desc';

-- ALTER TABLE demo  DROP CONSTRAINT pk_id_type;

-- insert into demo(id,type,remark) values(1,1,'test');
-- insert into demo(id,type,remark) values(1,1,'test2');