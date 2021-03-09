link-interface是一个maven Java工程，
dubbo官方推荐使用的一种模式，将实体bean和业务接口存放到接口工程中。

003-004-005三者为一体：
003-link-interface:接口工程-maven Java工程
不需要引入依赖，直接编写需要的实体bean和业务接口。
（接口实现类放在004中编写）
