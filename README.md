# microservice_coffeeshop     

## 简介    

这是一个微服务架构为基础的，简单的咖啡厅的微服务示例。主要的微服务工程如下：   

1. service_user 维护了来咖啡厅的用户的领域模型。    
2. service_item 维护了咖啡厅的主要商品，包含了咖啡饮品的领域模型。     
3. service_trade 包含订单、子订单的领域模型。 

主要使用的基础技术如下：        

* 微服务的服务发现使用EurekaServer。 EurekaServer的Docker镜像可以从 dockerhub 中download。     
* 微服务的数据组装、转发在API Gateway 工程中,可以去 [API-Gateway](https://github.com/lijingyao/gateway_coffeeshop) 工程中checkout代码。   
* 使用的工程构建工具：Gradle、Gradlew插件    
* 存储服务：MySQL——InnoDB   
* 涉及到的框架有：SpringMVC、SpringBoot、SpringCloud-Netflix、Hibernate、RxJava(Gateway工程中)    
* 服务间通信：Restful API   
* 服务基础涉及原则：DDD(Domain-Driven Design)     

其他：
编码：utf-8

## 部署信息   

### 基础服务部署      

需要启动的本地容器/服务：
注：以下服务可以通过docker镜像，也可以直接本地安装。工程中示例代码连接DB、Eureka、nexus 服务的地址，请替换成您本地配置的账号、密码。 


1. Mysql ：docker 容器可以使用官方镜像：[docker mysql image](https://hub.docker.com/_/mysql/)
2. Eureka :镜像：[netflixoss-eureka image](https://hub.docker.com/r/netflixoss/eureka/)
3. docker registry 镜像仓库： [docker registry image](https://hub.docker.com/_/registry/)
4. nexus 二方库、三方库镜像：[docker nexus image](https://hub.docker.com/r/sonatype/nexus/)     

### 微服务部署  

#### 打包docker镜像

运行gradle命令打包docker镜像，并且上传到本地的 docker 仓库。   
  
```
./gradlew buildDocker -x test 

```
然后运行 **docker images** 命令查看镜像信息。 

#### 运行docker 镜像

可以使用docker run 一键运行。或者使用docker-compose 做简单的容器编排  

```
docker run  -p :8080 -t localhost:5000/item:1.0.0  --name service-item  
```

如果不以docker容器运行，本地环境也可以直接运行每个微服务的Springboot实例。 


## 给读者的作业   

1. 用Java8 的 *Predicate* API  来实现对于入参和业务逻辑的校验。在DDD思想中，有参数的校验，也有领域模型自身逻辑的校验。
本demo 工程没有做这两种校验。先给读者做思考，怎样有更简洁、更高内聚的方式实现最基础的校验？     
2. 本demo中的 *AdditionalTasteVO* 中有一个DDD **值对象**的设计，关于价格计算模型，还有什么更好的方式呢？
目前只计算了 *espresso*的附加价，读者们可以继续做更多的价格模型扩展。    

## 解答

1. 更新代码后，主要看service 包下面多了 *validators*包，用来封装各种业务的校验器。以*UserValidator*类为例，
主要增加了对用户注册入参的校验。过程中产生的中间业务结果，也可以用**Predicate**实现。统一的校验器可以将相似
的逻辑抽象出来，并且减少service代码对于一般参数校验。更方便维护主领域模型的逻辑。 

2. 新增的代码在service_item的 *manager*包中。**PriceSelector**相当于策略模式的situation的选择器,示例中是
通过系统当前时间来判断和选择具体的策略。实际业务中会有更复杂的条件。示例代码中的策略分为两个，Summer,Winter。 
不同的季节不同的咖啡附加料价格不同，通过策略模式，可以很好得解耦不同的计算模型。如果计算流程是可以复用的，那么
还可以在策略中结合**Template**模式。


## Gitchat 课程

课程地址:      
[分布式微服务架构体系详解](https://gitbook.cn/gitchat/column/5b444ae694c0f60b4ec4a68c)
 
Gitchat chat地址：  
[基于 Docker 的微服务架构实践](https://gitbook.cn/gitchat/activity/5a425b957431432eb6052297)
