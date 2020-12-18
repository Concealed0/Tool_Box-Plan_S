# Tool\_Box · Plan A 

将该文件夹作为终生文件，记录开发历程与工作代码。  
　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　	---2020-10-14

## 项目说明
用于系统开发等、
### 目录结构

### 功能说明

### 名称定义
1、两个英文单词
2、简单易懂
3、直接明白内容

工具箱。装工具的箱子，如：钳子、榔头等工具都为设计好的作品\软件。
该项目包含多个软件项目，取名为工具箱，意为软件即工具，服务于人。




```mermaid
graph LR
    startA[项目] --> inputX[项目流程-微服务] 
    inputX --> inputX1[目录结构图]
	start[项目]-->input[concealed-platform]
	input --> inputA[platform-tool]
	inputA --> inputA1[mybatis-plus　　jar]
	inputA1 --> inputA11[自动加入代码]
	inputA --> inputA2[nginx-plus　　　pom]
	inputA2 --> inputA21[路由转发]
	input --> inputB[platform-server]
	inputB --> inputB0[platform-service-gateway]
	inputB0 --> inputB01[服务网关]
	inputB --> inputB1[platform-service-common]
	inputB1 --> inputB11[公共服务]
	inputB --> inputB2[platform-service-portal]
	inputB2 --> inputB21[服务主路径]
	inputB --> inputB3[platform-service-api]
	inputB3 --> inputB31[服务接口]
	inputB --> inputB4[platform-service-producer]
	inputB4 --> inputB41[服务生产者]
	input --> inputC[platform-client]
	inputC --> inputC0[platform-client-portal]
	inputC0 -->inputC01[客户端]
	input --> inputD[platform-search]
	inputD --> inputD0[搜索服务]
	input --> inputE[platform-date]
	inputE --> inputE0[大数据服务]
	
```





```mermaid
graph LR
    start[开始] --> input[输入A,B,C]
    input --> conditionA{A是否大于B}
    conditionA -- YES --> conditionC{A是否大于C}
    conditionA -- NO --> conditionB{B是否大于C}
    conditionC -- YES --> printA[输出A]
    conditionC -- NO --> printC[输出C]
    conditionB -- YES --> printB[输出B]
    conditionB -- NO --> printC[输出C]
    printA --> stop[结束]
    printC --> stop
    printB --> stop
```

```mermaid
graph LR
	A-->B
```

```flow
st=>start: Start|past:>http://www.google.com[blank]
e=>end: End:>http://www.google.com
op1=>operation: My Operation|past
op2=>operation: Stuff|current
sub1=>subroutine: My Subroutine|invalid
cond=>condition: Yes
or No?|approved:>http://www.google.com
c2=>condition: Good idea|rejected
io=>inputoutput: catch something…|request

st->op1(right)->cond
cond(yes, right)->c2
cond(no)->sub1(left)->op1
c2(yes)->io->e
c2(no)->op2->e
```



```mermaid
graph TD
    id[带文本的矩形]
    id4(带文本的圆角矩形)
    id3>带文本的不对称的矩形]
    id1{带文本的菱形}
    id2((带文本的圆形))
```





　

```sequence
Title:时序图示例
客户端->服务端: 我想找你拿下数据 SYN
服务端-->客户端: 我收到你的请求啦 ACK+SYN
客户端->>服务端: 我收到你的确认啦，我们开始通信吧 ACK
Note right of 服务端: 我是一个服务端
Note left of 客户端: 我是一个客户端
Note over 服务端,客户端: TCP 三次握手
participant 观察者
```

