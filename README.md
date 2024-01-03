# Mybatis-plus-join

## 使用高版本

为什么需要使用高版本

![image-20240103201332905](https://lan-drawing-bed.oss-cn-hangzhou.aliyuncs.com/hj/image-20240103201332905.png)

可以看到在1.4.5之前都是没有联表更新以及联表删除的所以导入新版就可以了

并且这个依赖中已经包含了mybatis-plus了 

```xml
        <dependency>
            <groupId>com.github.yulichang</groupId>
            <artifactId>mybatis-plus-join-boot-starter</artifactId>
            <version>1.4.5</version>
        </dependency> 
```





## Demo测试

### 创建数据库

导入建表sql,join_test.sql

![image-20240103201700572](https://lan-drawing-bed.oss-cn-hangzhou.aliyuncs.com/hj/image-20240103201700572.png)

可以看到有三张表

![image-20240103201723786](https://lan-drawing-bed.oss-cn-hangzhou.aliyuncs.com/hj/image-20240103201723786.png)

![image-20240103202011779](https://lan-drawing-bed.oss-cn-hangzhou.aliyuncs.com/hj/image-20240103202011779.png)

然后简答的demo,看测试类中的代码即可