# 开发者文档


## 本地调试

添加如下JVM参数：

-Dlog.dir=./logs    // 设置日志保存目录


## 如何打包发布

在项目根目录下有一个打包脚本：build.sh，直接运行该脚本即可完成打包。
```shell
bash build.sh
```


## 关于数据库表自动初始化

在Spring Boot中可以通过属性“spring.datasource.schema”设置在应用启动时执行的sql文件，来达到初始化数据表的目的。
值得注意的是：如果sql文件的中的语句存在语法错误，并不会影响应用的正常启动，但是也无法正常执行数据库表的初始化操作。
为了在应用启动时明确知道sql语句是否存在语法错误，可以设置spring.jdbc的日志级别为debug。
`logging.level.org.springframework.jdbc=DEBUG`










