003-004-005三者为一体：
005-link-consumer:服务的消费者-maven web工程
1.配置pom文件：添加需要的依赖（spring,dubbo,接口工程的依赖）
2.设置dubbo的核心配置文件
    a.声明服务消费者的名称
    b.引用远程服务接口
3.编写web层controller
4.添加扫描组件，视图解析器，注解驱动
5.配置中央调度器（就是一个servlet:DispatcherServlet）
