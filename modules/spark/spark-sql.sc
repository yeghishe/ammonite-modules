interp.load.module(wd / "Base.sc")
@

interp.load.ivy("org.apache.spark"  %% "spark-sql" % Versions.spark)
@

import org.apache.spark.sql.SparkSession

val spark = SparkSession
  .builder()
  .master("local[*]")
  .appName("Spark Console")
  .getOrCreate()

  import spark.implicits._
