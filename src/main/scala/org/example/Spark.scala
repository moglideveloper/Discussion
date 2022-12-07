package org.example

import org.apache.spark._
import org.apache.spark.sql.SparkSession

object Spark {

  def main(args: Array[String]): Unit = {


    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("SparkByExample")
      .getOrCreate()

    val data = List("John", "Tony")

    val rdd = spark.sparkContext.parallelize(data)

    rdd.collect().foreach( println )
  }
}
