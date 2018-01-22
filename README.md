#搬运地址

https://github.com/yiLu1022/DouyuDanmuCrawler

项目已经修改为pom版本的

搬运 generatorConfig.xml 未搬运jar文件，运行生成器的时候可以手动配置lib地址到maven或复制jdbc驱动到目录中

# 测试demo文件

cn.happysoul.douyu.demoApp.DyDanmuMain

cn.happysoul.douyu.demoApp.DyDanmuMain2

[boolean]storage 对应是否存储到数据库

onReceiveMessage方法用来处理收到的消息(是否用System.out.print消息，可以手动增加或删除Logger.v方法)


# 数据库配置
config.xml

# 心跳保持

通过多线程连接池 ScheduledExecutorService 定时45秒调用一次心跳保持，以维持在线状态

cn.happysoul.douyu.douyuClient.DyCrawlerImpl 

# 斗鱼开发论坛 Link

http://dev-bbs.douyutv.com/