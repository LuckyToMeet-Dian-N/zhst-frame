# zhst-frame
具体实现代码不再提交到社区，这套架构还有一些不足之处，例如尚未添加链路追踪，api 和 service 可以在开一个文件夹，将这两种服务放入其中。可以自行改进：

## 项目架构
<pre>
├─zhst-dependencies----------------------------父依赖，管理 jar 版本 
│  │
│  ├─zhst-eureka--------------------------------微服务注册中心
│  │
│  ├─zhst-common--------------------------------微服务公共工具类 
│  │  │
│  │  ├─zhst-common-web------------------web 服务公共依赖管理
│  │  │
│  │  ├─zhst-common-services------------------service 服务公共依赖管理
│  │  |
│  │  ├─zhst-common-bean------------------管理所有的 DTO po vo
│  │  |
│  ├─zhst-api--------------------------------对外暴露的接口，内部 feign 负载均衡
│  │  │
│  │  ├─zhst-api-order--------------------订单服务 api
│  │  │
│  │  ├─zhst-api-user---------------------用户服务 api
|  |  |
│  │  ├─zhst-api-product------------------商品服务 api
│  │  │
│  ├─zhst-service--------------------------------对外暴露的接口，内部 feign 负载均衡
│  │  │
│  │  ├─zhst-service-order--------------------订单服务提供者
│  │  │
│  │  ├─zhst-service-user---------------------用户服务提供者
|  |  |
│  │  ├─zhst-service-product------------------商品服务提供者
│  │  │
│  │  ├─zhst-service-mq---------------------mqtt、rabbitmq 服务提供者
|  |  |
│  │  ├─zhst-service-redis------------------redis 缓存提供者
│  │  │
│  ├─zhst-zuul-------------------------------- api 网关服务
│  │  │
</pre>

<pre>
内部硬性规定：

1. 所有传输到前台服务的对象必须使用 Vo 结尾。
2. 所有 PO DTO VO 需要放在 zhst-common-bean 管理，并注明版本，例如：v1 为首批开发者，v2 为第二批开发者，以此类推。
3. 数据库查询操作尽量单表操作，如需要连接表，最多不超过**<font color='red'>三张</font>**表连接
4. 接口返回数据时间不允许超过**<font color='red'>三秒</font>**。
5. 代码函数不可超过 100 行，多行重复代码请构造成一个新方法。
6. 服务内部禁止使用 ip:port 访问，需要以 **<font color='red'>服务名</font>** 进行访问
7. mapper 接口需要在各个提供服务的模块自行创建。
8. 除个别业务需要返回空外，接口问题一律抛异常处理，全局拦截会进行处理。专注业务实现即可。
内部提供三种错误：
    - CheckException 校验错误异常
    - SignatureException token被伪造异常
9. 数据封装对象 ResultBean,返回格式为：自定义返回码与错误信息。
10. 尽量避免循环查询数据库。
11. 注释原则。
    - 每个方法返回值，参数都需要注释。
    - 每个类的创建人，方法编写者注明自己名字与修改日期。
    - 业务中艰涩难懂的方法，需要加以注释，方便他们排查问题。
  
注释声明原则：

附： zhst-api-services 新增请求模板 restTemplate,用于在服务间调用其他模块服务.
</pre>
