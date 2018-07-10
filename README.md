# microservice_coffeeshop     

## 简介    

这是一个微服务架构为基础的，简单的咖啡厅的微服务示例。主要的微服务工程如下：   

1. service_user 维护了来咖啡厅的用户的领域模型。    
2. service_item 维护了咖啡厅的主要商品，包含了咖啡饮品的领域模型。     
3. service_trade 包含订单、子订单的领域模型。 

主要使用的基础技术如下：        

* 微服务的服务发现使用EurekaServer。 EurekaServer的Docker镜像可以从工程中下载并运行Docker命令:      
* 微服务的数据组装、转发在API Gateway 工程中,可以去Gateway 工程中checkout代码。   
* 使用的工程构建工具：Gradle、Gradlew插件    
* 存储服务：MySQL——InnoDB   
* 涉及到的框架有：SpringMVC、SpringBoot、SpringCloud-Netflix、Hibernate、RxJava(Gateway工程中)    
* 服务间通信：Restful API   
* 服务基础涉及原则：DDD(Domain-Drive Design)     

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


参考资料： 
[基于 Docker 的微服务架构实践](https://gitbook.cn/gitchat/activity/5a425b957431432eb6052297)
