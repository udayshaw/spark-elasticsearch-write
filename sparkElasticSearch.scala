df.write.format("org.elasticsearch.spark.sql").
              option("es.mapping.id",mapping_id).
              option("es.nodes",nodes).
              option("es.port",port).
              option("es.net.http.auth.user", username).
              option("es.net.http.auth.pass", password).
              option("es.write.operation",operation).
              mode("append").
              save(index+"/"+doctype)
