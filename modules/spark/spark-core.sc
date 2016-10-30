interp.load.module(wd / "Base.sc")
@

interp.load.ivy("org.apache.spark"  %% "spark-core" % Versions.spark)
@

import org.apache.spark.{SparkContext, SparkConf}
import org.apache.spark.SparkContext._

val sparkConf = new SparkConf()
  .setMaster("local[*]")
  .setAppName("Spark Console")
val sc = new SparkContext(sparkConf)
