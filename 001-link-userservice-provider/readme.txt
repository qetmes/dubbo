1.创建一个maven web工程：服务的提供者
2.创建一个实体bean查询的结果，即model/User
3.提供一个服务接口：xxxx,即service/UserService
4.实现这个服务接口：xxxxImpl,即service/impl/UserServiceImpl
5.配置dubbo服务提供者的核心配置文件：即dubbo-userservice-provider.xml
    a.声明dubbo服务提供者的名称：保证唯一
    b.声明dubbo使用的协议和端口号
    c.暴露服务，使用直连方式
6.添加监听器