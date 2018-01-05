# 部署

* 指定引导配置文件位置

    1. 通过环境变量`spring.cloud.bootstrap.location=file:/D:/etc/`引导配置文件`bootstrap.yml`所在目录, 注意以文件分隔符结尾.
    2. 在`bootstrap.yml`中可以配置注册中心集群地址
    
* 启动顺序

    1. 启动注册中心: `eureka`
    2. 启动配置服务: `config`
    3. 启动业务服务: `service`
    4. 启动客户端服务:  `client`
    
# 注意

* `contract`包

    1. 配置类使用`@EnableFeignClients`并设置扫描范围
    2. 接口中的url不能与WEB项目中的url重复, 建议服务中的url使用统一前缀, 如`/server`
    3. 接口参数`@RequestParam`注解不能省略, 并且参数名不能省略
    4. 