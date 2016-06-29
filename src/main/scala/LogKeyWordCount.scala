import org.apache.spark.{SparkContext, SparkConf}

/**
 * Created by chenyangxue on 2016/6/29.
 */
object LogKeyWordCount {
  def main(args: Array[String]) {

    if (args.length < 1) {
      System.err.println("Usage: LogKeyWordCount <file> <key word>")
      System.exit(1)
    }

    val conf = new SparkConf().setAppName("LogKeyWordCount").setMaster("local")
    val sc = new SparkContext(conf)
    val lines = sc.textFile(args(0))
    val count = lines.filter(_.contains(args(1))).count()
    println(args(1)+"'s count:"+count)

    sc.stop()
  }
}
