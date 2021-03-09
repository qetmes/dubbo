003-004-005三者为一体：
004-link-userservice-provider:服务的提供者-maven web工程
1.引入依赖，包括spring、dubbo、以及接口工程的依赖
2.提供一个服务接口的实现类：xxxx,即service/impl/UserServiceImpl
3.配置dubbo服务提供者的核心配置文件：即dubbo-userservice-provider.xml
    a.声明dubbo服务提供者的名称：保证唯一
    b.声明dubbo使用的协议和端口号
    c.暴露服务，使用直连方式
6.在web.xml中添加监听器