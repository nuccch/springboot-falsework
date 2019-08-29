# springboot-falsework


## 是什么

这个是一个便于开发基于Spring Boot框架的脚手架项目


## 为什么

不可否认，其实Spring Boot框架本身就已经是一个脚手架，已经为开发者集成了很多默认的配置。
不过，我认为这还有些不够用。

我们在使用Spring Boot框架时，经常会发现几乎每一个项目都会使用一些相同类库，比如连接池，JSON库等等。
但是却需要在每一次新项目构建的时候都去重复一遍相同的配置，其实完全可以将这些常用的配置整合为一个基本配置框架，直接基于该基础配置就可以使用了。
每次在开启新的项目时，直接Clone这个项目，修改对应的项目名称，去掉不需要的依赖即可，大大可以节省一些不必要的时间。

这就是这个脚手架工程存在的意义。


当然，不可否认的是，该脚手架项目并不一定适合所有的场景。也就说，或许您看到了这个脚手架工程，但是并不适合您的开发需求，那么请见谅！


## 如何使用

这个项目基于Maven进行构建，克隆到本地后，直接导入IDEA或者Eclipse，修改对应的项目名称以及一些其他参数就可以使用了。
在对这个基础框架项目进行改造之前，建议先运行一下程序确认是否可用（需要修改application-dev.properties文件中关于MySQL数据库的连接配置）。

具体需要修改的项目包括：
- 将项目名称重命名为指定名称，分为2步走：(1)直接重命名项目目录名 (2)修改pom.xml文件中的`<groupId>`和`<artifactId>`，以及`<version>`。
- 重命名根包:将项目根包`org.chench.springboot.falsework`，这个操作建议在IDE中完成。
- 将bin目录下启动脚本startup.sh中的启动主类`org.chench.springboot.falsework.SpringbootFalseworkApplication`修改为指定启动类
- 修改bin目录下停止脚本shutdown.sh中判断进程是否存活的进程名称`SpringbootFalseworkApplication`为实际的项目进程名称

其他信息可以参考doc目录下的developer.md文件内容。


## 集成组件说明

+ 集成j2cache使用缓存功能
+ 支持应用启动时自动执行数据库表DDL(指定文件)
+ 集成swagger生成API文档
+ 支持WebSocket
+ 集成日志框架：slf4j + logback，其中logback配置文件为logback.xml
+ 集成MyBatis，运行时参数配置文件为mybatis-config.xml，支持接口形式的映射器和xml形式的映射器
+ 集成fastjson
+ 集成druid