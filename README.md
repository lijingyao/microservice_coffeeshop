# microservice_coffeeshop

这是一个微服务架构为基础的，简单的咖啡厅的微服务示例。主要的微服务工程如下：   

1. service_user 维护了来咖啡厅的用户的领域模型。    
2. service_item 维护了咖啡厅的主要商品，包含了咖啡饮品的领域模型，以及售卖的咖啡周边（杯子）等商品的模型。   
3. service_trade 包含订单、子订单的领域模型。 

主要使用的基础技术如下：        

* 微服务的服务发现使用EurekaServer。 EurekaServer的Docker镜像可以从工程中下载并运行Docker命令:      
* 微服务的数据组装、转发在API Gateway 工程中,可以去Gateway 工程中checkout代码。   
* 使用的工程构建工具：Gradle、Gradlew插件    
* 存储服务：MySQL——InnoDB   
* 涉及到的框架有：SpringMVC、SpringBoot、SpringCloud-Netflix、Hibernate、RxJava(Gateway工程中)    
* 服务间通信：Restful API   
* 服务基础涉及原则：DDD(Domain-Drive Design)     

资料：
[基于 Docker 的微服务架构实践](https://gitbook.cn/gitchat/activity/5a425b957431432eb6052297)
