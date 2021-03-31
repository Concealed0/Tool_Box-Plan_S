# Concealed\_Platform\_Service · Plan A 


将该文件夹作为终生文件，记录开发历程与工作代码。  
　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　	---2020-10-14

## 项目说明
用于系统开发等、
### 目录结构

### 功能说明






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

```java
public void main(String[] asrg){
    return null;
}
```

记录



```mermaid
    graph TB
subgraph 原方案
  start1[common 多线程解决方案]
end
    start[开始] --> input[每十分钟启动一次]
    input --> inputA[遍历开启等级的权益]
    inputA --> inputA1[权益A1]
    inputA --> inputA2[权益A2]
    inputA1 --> inputB[遍历启动的等级方案]
    inputB --> inputB1[方案B1]
    inputB --> inputB2[方案B2]
    inputB2 --> inputC[遍历所有会员]
    inputC --> inputC1[会员C1]
    inputC --> inputC2[会员C2]
    inputC2 --> inputD[根据方案判断:等级-成长值-积分-升级-降级]
    inputD --yes--> inputE[升级营销-升级记录-更新当前等级-记录升级日志-推送消息]
    inputD --yes--> inputF[降级营销-降级记录-更新当前等级-记录升级日志-推送消息]
    inputE --> inputG[送券送积分-推送微信消息]
    inputF --> inputG
    inputG --> stop[结束]
    
    
    
 
```





1、减少存储过程。2、大循环包含小循环。3、5万一个线程。4、适配单个会员，以用于交易后实时更新。

```mermaid
graph TB
subgraph 方案A
start1[common 多线程解决方案]
end
start[开始] --> inputA[读取开启等级权益的升级方案]
inputA --> inputB[待定是否放入Redis]
inputB --> inputC[读取所有会员]
inputC --> inputCC[开启多线程-每1万开启一个线程]
inputCC -->inputCC1[线程1]
inputCC -->inputCC2[线程2]
inputCC1 --> inputD[根据方案判断:等级-成长值-积分-升级-降级]
inputD --yes--> inputE[升级营销-升级记录-更新当前等级-记录升级日志-推送消息]
inputD --yes--> inputF[降级营销-降级记录-更新当前等级-记录升级日志-推送消息]
inputE --> inputG[送券送积分-推送微信消息]
inputF --> inputG
inputG --> stop[结束]
```



```mermaid
graph TD
input[优化控制表]
inputE[优化场景]
inputE --> inputE1[对应优化方案]
inputA[控制时长-CT]
inputA -->inputA1[动态控制定时任务时长]
inputB[线程数-TQ]
inputC[线程处理数-HQ]
inputC -->inputB1
inputB -->inputB1[动态横向控制服务器负载压力]
inputD[分批规则-BM]
inputD -->inputD1[大数据量下的分批规则]

style input fill:#f9f,stroke:#333,stroke-width:4px
style inputE1 fill:#7FFF00,stroke:#333,stroke-width:4px
style inputA1 fill:#7FFF00,stroke:#333,stroke-width:4px
style inputB1 fill:#7FFF00,stroke:#333,stroke-width:4px
style inputD1 fill:#7FFF00,stroke:#333,stroke-width:4px
```

```mermaid
graph TD

subgraph 举例说明
R1[例__100万会员总量_TQ=10个_HQ=5万] --> R2[根据BM进行分批,每次50万会员,分两个批次]
R2 --> R3[批次循环处理,几个批次线程循环几次]
R3 --> R4[单个线程执行记录执行批次及数量]
end

subgraph 优化后方案
start1[common 多线程解决方案]
end

start[开始__定时任务] --> inputA[取配置,TD,CT,TQ,HQ,BM]
subgraph 前期处理
inputA --> inputB[开启线程池,根据TQ-HQ设置进行分批]
inputB --> inputB1[总量分批-分批方式B-M]
inputB1 --> inputB2[批次1=TQ*HQ]
inputB1 --> inputB3[批次2=TQ*HQ]
end

inputB2 --> inputC[线程0]
inputB2 --> inputD[线程...]
inputB2 --> inputE[线程9]

subgraph 独立线程9
    inputE --> inputE1[处理会员升级逻辑]
    end
subgraph 独立线程....
    inputD --> inputD1[处理会员升级逻辑]
    end
subgraph 独立线程0
    inputC --> inputC1[处理会员升级逻辑]
    end

style start1 fill:#f9f,stroke:#333,stroke-width:4px
style inputB1 fill:#DC143C,stroke:#333,stroke-width:4px
style inputB2 fill:#DC143C,stroke:#333,stroke-width:4px
style inputB3 fill:#DC143C,stroke:#333,stroke-width:4px
style R3 fill:#ADD8E6,stroke:#333,stroke-width:4px


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

