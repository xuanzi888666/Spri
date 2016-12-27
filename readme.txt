Spring sping Hibernate 整合步骤
1. 创建maven web项目  pom 下添加jar
    数据库连接 jar
    Hibernate 核心jar
    spring jar
    日志 log4j
    Hibernate  spring 整合连接 spring-orm 使用 时和spring 版本对应
2. hibernate.cfg.xml
    配置数据库方言
    Hibernate生成的SQL语句方法
    配置currentSession的上下文环境
    配置自动根据映射文件更新数据表
3.  applicationContext.xml
    配置自动注入
    配置数据源
    配置的hibernate SessionFactory
       其中要配置  <!-- 配置需要扫描的包路径，在该包下，所有的类注解配置都会被扫描 -->
                  <property name="packagesToScan" value="com.ssh.entity" />
    配置事务管理
