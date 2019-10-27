# Java学习

[TOC]

## 回顾：

### 数据类型

#### 基本类型（8种）

byte1，short2，int4，long8

flaot4，double8

Char2

boolean1

运算规则（5条）

Integer.MAX_VALUE+1，负数最小值

2-1.9得0.1等，浮点数运算不精确地问题

infinity - 3.14/0

NaN - Math.sqrt(-3)，0/0

#### 运算符

+-*/

%

== != > >= < <=

&& || ! 

++ 

--

三项运算：表达？1：2

=

+= -= *= /= 

()

#### 流程控制

If-else if-else

Switch-case-default

for

while

do-while

#### 引用类型

## 程序结构与数组

### 知识点

###  switch

只能判断byte，short，char，int，enum，jdk1.7以后String

switch(表达式或变量) {

case 变量1：

​		表达式

case 变量2：

​		表达式2 break; // 跳出循环

}

#### break和continue

break:跳出循环，或跳出switch

continue：继续进入循环的下一轮

**循环的命名**

在嵌套的循环中，控制外层循环break或continue，需要对外层循环命名

Outer:

for（）{

​	for() {

​		break outer;

​		continue outer;

​	}

}

#### while和do-while

先判断再执行

whiel(执行条件) {

代码块

}

先执行再判断

do {

代码快

} while(执行条件);

### 数组

用来存放一组数据的数据结构

#### 创建数组

数据类型 变量名 = new 数据类型[数量/数组长度]；

int[] a = new int[5]

新建某长度的int[] 数组，默认值为0。

变量名存的是数组的内存地址值。

int[] a = {1,2,3,4,5,6,7,8};

为已经存在的数组变量重新赋值，也用大括号初始化数据

a = new int[] {3,6,45,7,5,3,67,3};

#### 数组的长度属性

变量名.length 

数组一旦创建，该属性值不可变为常量

对大下标a.length-1

长度允许0

#### 数组的遍历

for(int i=0; i<a.length;i++) {

​	a[i];

}

项目：day0302.Test1

#### 数组的复制

Arrays.copyOf(数组，新的长度)

可以把数组复制成更长或更短的新数组

**会创建一个新的数组**

System.arraycopy(

​		原数组，

​		原数组起始位置，

​		目标数组，

​		目标数组起始位置，

​		复制的数据量大小)

**不会新建数组，目标数组需要事先创建好**

双色球：Test2

冒泡排序：Test3

#### 二维数组

存放数组的数组

一维数组：[1, 2, 3, 45, 54]

二维数组：[[2, 3, 3, 4], [4, 65, 56], [543, 345, 453, 534, 56]]

##### 创建二维数组

**int[][] a = new int[3][2];**

创建一个外围数组，长度3

创建三个内部数组，长度2

共创建了四个数组

**int[3] [] a = new int[3] [];**

只创建一个外围数组，三个位置存的是默认值null；

可以之后再创建数组，来放入二维数组

a[0] = {32,5,345,34,32} ;以此类推，长度可不同。

int[][] a = {

{123,234,23},

{432,342423,234},

{234,6,7,567,},

};

**二维数组的遍历**

for(int i=0;i<a.length;i++) {

​	for(int j=0;j<a[i].length;j++) {

​		a[i] [j]j;

​	}

}

##### 二维数组的遍历

### 方法的递归

自己调用自己。在一步一步的简化问题，把问题简化成最简问题，再倒推出结果。

**正向传递反向归还**

项目：day0303.Test1

**递归由于方法的简单和巧妙，但是吃栈内存，需要提前考虑分配相应的空间**

## 面向对象

人为的一种编程模型

复杂问题进行拆分，拆分成一个一个的小问题，通过解决小的问题，来解决复杂问题。

### 类

对一类事物，算法，逻辑，概念等的抽象

把相关的数据和逻辑运算方法，封装成一个“类”组件

把“类”理解城市模板，或者是图纸。

### 对象

从类创建的具体实例，每个实例都占用独立的内存空间，保存各自的属性数据。

每个实例，都可以独立的执行指定的代码。

### 引用

引用类型变量，保存一个对象的内存地址

引用类型的特殊值：null，空，不存任何对象的地址

项目：day0304_士兵（Test1）

### 构造方法

创建对象时执行的特殊方法

**一个类中必须有构造方法**

不写构造方法，编译器编译时会添加默认构造方法

自定义构造方法

class A {

​	public A() {}

​	public A(int i) {}

​	public A(int i, String s) {}

}

练习：汽车，day0401.Car|Test1

### this

This.xxx

this是一个特殊的引用，应用当前实例的内存地址

当前实例：正在使用的实例

this（）

构造方法之间的调用

this（）必须是首行代码

### 方法重载 overload

定义：同名不同参。方法名称一样，参数列表不一样。

println().........

### 继承

作用：代码重用|复用。

**Java是单继承**

**一个类只能继承一个父类**

**一个父类可以有多个子类**

练习：继承，day0402.Person|Student|Employee|Test1

#### 不继承

构造方法和私有成员不能继承

#### 子类实例

先创建父类实例

再创键子类实例

两个实例绑定，整体作为一个实例

调用成员时，先找子类，再找父类

#### 方法重写@Override

从父类继承的方法，在子类中重新定义i，重新编写

#### 父类的构造方法

新建子类实例时，会创建父类的实例，也会先执行父类的构造方法

默认执行父类的构造方法

#### super

Super.xxxx()

重写的方法中，调用父类同一个方法的代码

super()

调用父类的构造方法，默认调用父类无参构造方法：spuer()

也可以手动调用：super(参数列表)

this（）和super（）不可同时出现，因为都要求首行代码

练习：继承

项目：电子宠物：day0403.Pet|Dog|Cat|Test1

### 多态（重点）

作用：一致的类型

所有子类型的实例，都可以被当做一致的父类型来处理

类型转换

#### 向上转型：（多态的一种）

子类实例，转型成父类型

用父类型的引用变量来引用子类对象地址，当然也可以用子类对象引用变量

#### 向下转型：为了调用子类或成员类中的特殊方法

已经转成父类型的子类实例，再转回成子类型

练习：继承接多态：图形形状

项目：day0404.Shape|Line|Circle|Square|Test1

**instanceOf**

运行期的类型识别

对真是类型及其父类型判断，都给返回true

Shapoe shape = new Line();

shape instanceof Line|Shape|Object：true

### 抽象类：abstract

半成品类，一个没有完成的类

抽象方法

只提供方法的定义，没有提供方法的具体代码

```java
public abstract f() {}
```

抽象方的作用：

作为通用方法，在父类中定义，并且要求子类必须完成实现这个方法

**抽象类不能新建实例**

### 回顾

#### 数据类型：

基本类型：byte1、short2、int4、long8、float4、double8、char2、boolean1

基本类型运算规则：最大类型与结果一致

整数运算溢出integer.MAX_VALUE+1得负数最小值

浮点数运算不精确

2-1.9得0.10000000000000000009

4。35*100得434.9999999999994

infinity，NaN

运算符

+-*/

%

== !=  > > = < <=

&&

||

!

++,--

1?:2:3

=+ -= /= *= %=

流程控制

if。。。，for，while，do-while，break，contiinue，

数组

创建数组

int[] a = new int[5];

int[] a = {6,1,2,3,4};

A = new int[] {6,4,3455,345,};

数组长度属性

a.length

数组的遍历

for（int i=0;i<a.length;i++） {

​	a[i]

}

Arrays：toStirng()、copyOf()、sort()、binary

Search()

面对对象

类、模板、图纸

对象、实例

引用、遥控器

构造方法、新建实例时执行

this：this.xxx，特殊引用，引用当前实例的地址

this（），构造方法之间调用

方法重载：同命不同参数列表

继承：

作用：代码复用|重用。

单继承

子类实例：由子类实例和父类实例绑定，整体作为一个实例

调用成员时，先找子类，再找父类

方法重写：

从父类继承的方法，在子类中，重新定义重写

super：super.xxx，重写方法时，调用父类中同一个方法代码

super（），调用父类构造方法，默认调用无参super（）

手动super（有参）

多态：

作用：一致的类型

子类实例，当做父类型处理

向上转型，向下转型

instanceof，运行期类XING识别、判断，对真是类型和父类型判断都会得到true

抽象类

抽象方法的作用：

作为通用方法，在父类中定义

要求子类必须实现这个方法

### final

### static

### 常量

### 访问控制符

### 对象的创建过程

### 接口

### 内部类

## API

### Object

Object是所有类的顶层父类，不继承其他任何类，默认继承Object类。

方法toString()

获得一个实例的字符串表示

Point a = new point(3，4);
S = a.toString();

Object中默认的实现是："类型@地址值"

Day0501.Point@1f5gh8g"

如果得到自定义格式，可以重写这个方法

equals(Object obj)

**当前对象与参数对象比较是否相等**

**Object的默认实现是比较内存地址**

this==obj

如果要比较势力中的属性是否相等，要重写equals()方法

练习;Object

项目：daya0501

### String

字符串是封装chasr[]数组的对象

创建String实例：

char[] a = {'a','g','r'};

String s = new String(a);

第一种语法的简化语法（底层生成一样）:

Sting s = "abc";

字符串的字面值：

第一次用到一个字面值时，会在“字符常量池”新建实例

再次使用相同字面值时，在"常量池"中访问的存在的字符串实例，而不重复创建。

**在Java中字符串不可变**

String s4 = s1+s2+s3，每一个加号都会创建新的实例，中间结果新建对象，效率低下

字符串加好链接，效率低 

字符串的方法

length()：字符串长度，字符的数量

charAt(i)：取i位置的字符

indexOf(子串)：查找子串，返回子串的起始位置，找不到返回-1

index(子串，start)从start位置开始向后找

lastIndexOf(子串)：从后向前找子串

substring(start)：截取[start, 长度)范围的子串

substring(start，end)：截取[start, end)范围的子串

练习：字符串

项目：day0502

### StringBuilder

可变的字符序列

提供了一组对内部字符修改的方法

常用来替代字符串，做高效率字符串链接运算

append（。。。）追加字符内容

内部的char[]数组，默认的初始容量是16

放满，会新建容量翻倍的新数组（指数级增加）

项目；day0503.StringBuilder

StringBuilder的方法：

insert(i，子串)；在i位置插入一段子串

delete(start，end)：删除区间子串

deleteCharAt(i)：删除单个子串

reverse()；字符串翻转

StingBuilder和StringBuffer

StringBuffer是旧版本的类JDK1.0

特点：线程安全，线程锁，牺牲性能，降低效率

StringBuilder是新版本的JDK1.5以后

特点：线程不安全，性能好，效率高。

**为了解决线程安全问题，可以自定义添加线程安全代码，无需在具体代码中考虑，所以优先使用StringBuilder**

### 正则表达式

是一种独立的语法，与Java无关

正则表达式用来判断用户输入，是否符合输入格式要求

| 正则表达式                | 匹配的内容            |
| ------------------------- | --------------------- |
| k                         | K                     |
| abc                       | abc                   |
| [abc]字符集匹配单个字符   | a,b,c                 |
| [a-z]表示范围内的字符     | 任意一个小写字母字符  |
| [a-zA-Z_0-9]              | A,a,9,__              |
| [^a-zA-Z]                 | 排除英文字幕          |
| [\u4e00-9fa5]用中文字符集 | 中文范围              |
| \d                        | 数字[0-9]             |
| \D                        | 排除数字[^0-9]        |
| \w                        | 单词字符[a-zA-Z_0-9]  |
| \W                        | 排除单词字符          |
| \s                        | 空白符                |
| \S                        | 排除空白符            |
| .                         | 任意字符              |
| [abc?]                    | ?0或1个               |
| [abc]?[123]前空后不空     | a1,b1, c1,1,2         |
| [abc]*0到多个             | A,bc,abc,abcbabcbacab |
| [abc]+1到多个             | a,bc,ca,acbcacb,      |
| [abc]{3}限定死3个         | abc,cba,bca           |
| [abc]{3,5}3到5个          | ccb,acbc,acbca,       |
| [abc]{3,}3到多个          | abc,acb,acbcbcacbca   |
| ^                         | 用来匹配起始位置      |
| ^a.+                      | a,ab,abc,abc5dfg5%b   |
| $                         | 用来匹配结束位置      |
| \|                        | 或                    |

String类中正则表达式运算方法

matches（正则）

当前字符串，能否参与参数正则表达式相匹配

split（正则）

用匹配的子串，来拆分字符串

replaceAll（正则）

把匹配的子串，替换成新的子串

练习：正则

项目：day0504正则表达式

### 基本类型的包装类

基本类型变量，直接存值

引用类型变量，存对象的内存地址

有时，需要把基本类型，当做引用类型的对象来处理，

这时，需要把基本类型值，包装尘一个对象

```java
void f(Object object) {}

f(new Integer(6));
```

八中基本类型的包装类型：

Byte|Short|Integer|Long|Float|Double|Charactor|Boolean

包装对象内包含的值，不能修改

访问内部包含的基本类型值：

byteValue()

shortValue()

intValue()

longValue()

floatValue()

doubleValue()

### Integer

创建对象：

new Integer(6)

Integer.Value(6)

Integer类中，有一个数组，缓存着256个Integer实例，封装的值从-128~127

如果指定范围内的值，使用缓存对象，而不新建；

如果指定范围外的值，直接新建实例。

Integer中的方法：

把字符串解析成int

Integer.parseInt("255") 255

Integer.parseeInt("11111111",2) 255

Integer.parseInt("ff",16) 255

进制转换

Integer.toBinaryString(255) "11111111"

Integer.toOcatalString(255) "377"

Integer.toHexString(255) "ff"

练习：包装类

类day0505

### BigDecimal，BigInteger

**精确的浮点数运算**

**超大整数运算**

新建实例与方法

```java
bd = BigDecimal.valueIOf(2);
add(BigDecimal bd);
subtract(BigDecimal bd);
multiply(BigDecimal bd);
divide(BigDecimal bd);
divide(BigDecimal bd, 保留位数，舍入方式);
setScal(保留位数，舍入方式)

```

项目：day0506BigDecimal

### Data

是封装一个毫秒值，表示一个精确的时间点

创建实例：

newDate()：封装系统当前时间的毫秒值

newDate(某一个毫秒值L）：封装指定的毫秒值

 https://wakatime.com/integrations 方法：

getTime()

setTime(long t)：存取内部封装的毫秒值

a.compareTo(Date d)

当前对象与参数对象d比较大小

当前对象a大，正数

当前对象a小，负数

相同，0

练习;日期day0507

### SimlpeDateFormat

日期格式工具

方法：

format(Date d)：实例格式化成字符串

parse(String s)：日期字符串，解析成实例

创建对象：

new SimpleDateFormat(格式：自定义)

格式：

"yyyy-MM-dd-hh|HH:mm:ss"

"dd/MM/yyyy"

"M-d-H:m"  个位数不会补零

"yyyy年MM月dd日"

## 集合

LinkedList

ArrayList

HashMap

回顾

面向对象：封装、继承、多态

封装：

类、对象（实例）、引用、构造方法、this、方法重载

继承：

作用：代码重用、复用

子类对象：有父类对象和子类对象绑定，整体作为一个对象

调用成员时，先找子类，再找父类

方法重写：从父类继承的方法，子类中重新定义、重新编写

super：super.XXX()|super(...)

多态：

作用：一致的类型

向上转型、向下转型

instanceOf判断对象的类型

抽象类

半成品类，一个没有完成的类

抽象方法的作用：

1、作为通用方法在父类中定义

2、要求子类必须实现这个方法

### final

三种用法：final常量、final方法、final类

####final常量：常量的值不可变。

```java
final int a = 6;
a = 7;

final Point a = new Point(3, 4);

```

#### final方法

不能被子类重写，最终实现方法不可被重写

#### final类

不能被继承，没有子类，最终类

#### Static

**静态，属于类而不属于实例**

JVM：方法区、栈内存、堆内存

类加载方法区|栈内存、对象和成员变量在市里的内存空间堆内存

静态变量在方法区静态类的内存空间里面，只加载一次。

非静态变量在堆内存中，实例的内存空间。

**静态方法中，不能直调用非静态成员，除非新建对象**

静态初始化块

```java
class A {
    static  {
        // 类被加载到内存时，会执行静态初始化块，当且仅当执行一次
    }
}
```

项目：day0601_士兵

#### 常量

static final 两个关键字来定义常量

敞亮的命名习惯：全部大写，多个但单词用下划线区分

```java
static final int MAX_VALUE = 100;
```

### 访问控制符

控制一个类，或类中的一个成员的访问范围

|           | 类   | 包   | 子类 | 任意 |
| --------- | ---- | ---- | ---- | ---- |
| public    | 可以 | 可以 | 可以 | 可以 |
| protected | 可以 | 可以 | 可以 |      |
| [default] | 可以 | 可以 |      |      |
| private   | 可以 |      |      |      |

**选择的原则：尽量选择小范围，接口一定要稳定“兼容，隐藏小范围选择，更便于代码的修改和维护，不会造成代码污染“**

```java
class A {
    int v1;
    static int v2 = 2;
    static {}
    A() {} 
}

class B extends A {
    int v3;
    static int v4 = 4;
    static {}
    B() {}
} 
```

New B()

第一次用到A、B

先加载父类，再加载子类

加载父类，为父类的静态变量分配内存

加载子类，为子类的惊静态变量分配内存

执行父类静态变量赋值运算|静态块初始化（顺序先后代码前后）

执行子类静态变量赋值运算|静态块初始化（顺序先后代码前后）

创建对象

先创建父类实例，为父类实例的变量分配内存

先创建子类实例，为子类实例的变量分配内存

执行父类实例变量的赋值运算

执行父类的构造方法

执行子类实例变量的赋值运算

执行子类的构造方法

项目：day0603_创建对象的过程

## 接口

作用：结构设计工具、用来解耦合，隔离实现

是一个极端的抽象类

只能定义：

1、公开的常量

2、公开的抽象方法

3、公开的内部类，内部接口

使用interface代替class关键字

使用implements代替extends关键字

**接口不关心底层实现，只关心隔离实现的接口耦合关系**

**一个类可以同时实现多个接口**

```java
class A implements X,Y,Z {}
class A extends B implements X,Y,Z {}
```

**接口之间的继承是多继承，还使用extends，**

```java
interface A extends X,Y,Z {}
```

项目：day0604_变形金刚

## 内部类

在类内部，方法内部，局部嗲马快内部定义的类

- 非静态内部类

    ```java
    class A {
        class Inner {
            // 不能单独存在和创建
        }    
    }
    A a1 = new A();
    A a2 = new A();
    A a3 = new A();
    Inner i = a1.new Inner();
    ```

    **非静态内部类的实例，必须依赖于外部类的实例才能存在**

    **一个复杂对象，用来封装局部的数据，或封装局部的运算**

- 静态内部类

    ```java
    class A {
        static class Inner {
        }    
    }
    Inner i = new Inner();
    ```

    **静态内部类可以独立创建实例**

    **静态内部类与普通的类没有区别，可以嵌套定义，也可以独立定义，只是一个设计上的选择可能项（可能关系紧密，便于放在一个类中）**

- 局部内部类

    实例的地址可以为向外传递，作为父类型传递到外面去

    ```java
    class A {
        public Weapon f() {
        	class Inner implements Weapon {
            }
            Inner i = new Inner();
            // 但是局部内部类可以传递返回该实例的内存地址
            return i;
        }
    }
    ```

项目：内部类day0605_内部类

## 集合

**存放一组数据的数据结构**

数组的缺点：（相对繁琐，如果频繁的创建，读取和计算再议）

- 长度不可变
- 访问方式单一
- 数据插入或删除，操作繁琐（容量和copy位移）

### 集合的继承结构

Collection接口

​	|—List接口

​		|—ArrayList

​		|—LinkedList

​	|—Set接口

​		|—HashSet

​		|—TreeSet

Map接口

​	|—HashMap接口

​	|—TreeMap接口

Iterator接口

Collections集合工具

### LinkedList：环状结构的双向链表

**首尾互相引用节点，一种特殊封装的数据结构，其头尾效率最高一步计算，越往中间计算效率越低。类似于积木和链条，对每个环节可方便操作**

双向链表，首先创建一个双向节点，对数据进行封装，然后会对前后引用相应的节点，没有用null值，最后首尾呼应，形成一个环状结构。

方法：

add（数据）：添加数据

get（i）：访问i位置的数据

remove（i）：删除指定为的数据

remove（数据）：找第一个相等的数据删除，返回值true：找到并删除了数据；false：找不到相同的数据。

iterator（）：迭代器，辅助新建迭代器实例的方法

list.Iterator();

addFirst（），addLast（）

getFirst(),getLast()

removeFirst(),removeLast()

项目：day0606_LinkedList



ArrayList

HashMap

异常

IO

File

FileInputStream，FileOutputStream

ObjectInputStream，ObjectOutputStream

InputStreamReader，OutputStreamWriter

### ArrayList

内部用数组存放数据

**访问任意位置效率高，增删数据，效率可能会降低**

内部是数组初始容量是10

方法；

add(数据)：添加数据

get（i）：获取i位置的数据

remove（i）：删除第一个相等的数删除

size（）：数据的数量

项目：day0701

ArrayList和LinkedList的选择

**只在两端操作数据，选择LinkedList；**

**数据量小的时候，频繁的增删数据，选择Linkedlist；**

练习：丑数；项目：day0702

### HashMap

| key  | value  |
| ---- | ------ |
| 9527 | 唐伯虎 |
| 9528 | 华夫人 |
| 9529 | 旺财   |
| 9529 | 小强   |
| 9530 | null   |
| null | ---    |

**哈希表的作用：快速定位查找数据**

键：

1、不重复，值可以重复

2、无序

方法：

put(key, value)：放入键值对数据，如果放入重复的键，新值会覆盖旧值

get(key)：用键取出它对应的值，如果键不存在，取出null

remove(key)：删除键值对

size()：键值对的数量

练习：hashMap

项目：day0703

### 哈希运算过程（重点，熟练）

使用Entry[]数组来存放数据

Entry是封装键值对的对象

数组默认初始长度是16

存放数据的过程：

key.hashCode()获取键的哈希值

通过哈希值来计算下标i

新建Entry实例，封装键值对，放入i位置

（通过内部算法控制存放位置，且不连续，随着数据的增加，有可能产生冲突，如果是相同的用新值覆盖旧值，如果键不相等，用链表连接起来）

- 空位置直接放入
- 有数据，依次用equals()比较键是否相等
- 有相等的键，用新值覆盖旧值
- 没有相等的键，用链表连接在一起
- 负载率：数据量/数组容量，加载因子到0.75以上时
- 新建翻倍容量的新数组
- 所有的数据，重新计算哈希运算，放入新数组
- **Jdk1.8以后，链表长度到8，会转成红黑树（二叉树，左小右大），删除树上的数据，减少到6，会转回成链表**

## 异常

**封装错误信息的对象**

**错误信息：类型、提示消息、行号**

### 异常的继承结构：

Throwable父类

​	|- Error：系统级错误（JVM底层的错误，尽量程序安全退出）

​	|- Exception：可修复的错误

​		|- 其他Exception

​		|- RuntimeException

​			|- NullPointerException

​			|- ArrayIndexOutOfBoundException

​			|- ArithmeticException

​			|- NumberFormatException

​			|- ClassCastException

练习：项目：day0704

### 异常捕获

```java
try {
    
} catch() {
    
} catch() {
    
}
```

### throws（抛出管道）

设置异常的抛出管道

方法中抛出异常现象，必须存在对应类型的异常管道才能抛出

```java
void f() throws X,Y,Z {
}
```

所以方法上，存在一个默认的遗产骨干到，类型是RuntimeException，它和它的子类型异常，都可以从默认管道抛出

练习：throws      类：Test2

### catch和throws的选择（重点，熟练）

**一般底层异常，需要向前抛出，抛到前面进行捕获处理**

**在调用路径中，可以选择一个合适的位置处理异常**

**如果不知道哪里处理异常合适，就要一直向前抛，而不能随便捕获，一旦捕获就必须处理**

### 异常的包装

捕获的异常，包装成另一种类型，再抛出

使用场景：

1. 不能抛出的异常，包装成能抛出的异常类型（比如不能抛出父类方法之外的异常）
2. 异常简化：多种类型简化成一种

练习：异常的包装，类Test3

```java
// 由于方法重写导致不能直接抛出，即不能跑出父类方法之外的更多异常
// 所以需要先捕获，但是又不想处理，
// 最终利用运行期异常类包装该异常，通过捕获后包装异常抛出
```

### 自定义异常（比较常用）

**现有的异常类型，不能表示业务中的错误情况，这是需要自定义新的异常类型**

转账A—>B：ZhuangZhangShiBaiException

用户名错误：UsernameNotFoundException

密码错误：WrongPasswordException

自定义异常：

1. 起一个合适的类名
2. 选择一个合适的父类
3. 添加一个合适的构造方法

练习：自定义异常，类：Test4

## IO（基础常用）

input /output：输入/输出

**输出：内存中的数据，向外部存储器输出，保存到文件**

**输入：读取外部存储器的文件数据，把数据读入内存进行运算处理**

### File类

封装一个磁盘路径，可以是：

1. 文件路径 —— ~/a.txt
2. 文件夹路径 —— ~/aa/bb/
3. 不存在的路径 ——~/dsa/das/dfd

方法：

- 文件或文件夹属性：
    exists()：判断路径是否存在

    isFile()：判断路径是否是文件路径

    isDirector()：判断路径是否是文件夹路径

    length()：文件的字节量，但是对文件夹无效（不能获得整个文件夹的大小，只能获得文件）

    getName()：文件名

    getAbsolutePath()：绝对路径，完整路径

    getParent()：父目录

    。。。

- 创建或删除：

    createNewFile()：

    新建文件，如果文件已经存在，不会创建，返回false；

    文件夹不存在，会出现异常

    mkdirs()：（mkdir()只能创建存在文件夹下的文件夹）

    创建多层文件夹，逐层从上到下创建的多层文件夹

    delete()：

    删除文件，或删除空文件夹

- 目录列表：

    list()：

    得到String[]数组，只包含文件的名称字符串

    [“da.txt”,"dfas","b.mp3"]

    listFiles():

    得到File[]数组，包含文件封装的File实例

    [{...},{...},{...}]

练习：文件，项目：day0705.Test1

练习：day0705.Test2

FIS、FOS、BIS、BOS、OIS、OOS、ISR、OSW

FIS与FOS：直接与文件相接，读取文件中的数据

- 创建：

new FileOutputStream（文件）：不管文件是否存在在，都新建空文件

new kFileOutputStream(文件，true)：如果文件已经存在，在文件末尾追加数据

- 读写数据的方法：

    write（int b）：int四个字节中，只输出末尾的一个字节值

    write（byte[],from,n）:输出数组中从from开始的n个字节值

    read（）：读取一个字节，补三个0字节，转成int，读取结束后，再读取，返回-1

    read（byte[] buff）：按数组的长度，从文件读取一批字节值，放入数组，返回这一批的字节数量，结束返回-1

BIS与BOS：缓存内存中写入读取文件数据到IO

对象序列化与反序列化：

序列化：把一个实例的信息，按照固定的字节格式，转成一串字节值

被序列化的对象，必须实现Serializable接口

方法：writeObject（实例）、readObject（被序列化对象）(注意强制转成某个类对象而后输出)

序列化版本id：旧版本的数据，不允许恢复成新版本的类型

自己不定义，编译器编译时，会添加默认的版本id，根据类的定义信息，来计算产生一个版本的id。

ISR与OSW：字符编码转换流

unicode统一码：万国码，双字节

java的char类型，使用unicode编码

UTF-8是unicode的传输格式

英文单字节，某些字符双字节，中文三字节，特殊字符四字节

java的unicode字符编码与其他编码的相互转换

## 进程>线程>协程

进程：在操作系统中，并行执行的任务。

线程：在进程内部，并行执行的任务。

### 创建线程（最好用线程池）

#### 继承Thread类（相对实现简单）

继承Thread类，定义Thread的子类，在子类中重写run（）方法添加线程中执行的代码。

线程启动后，自动执行run（）方法中的代码

练习：day0802

#### 实现Runnable接口（实现接口的对象，线程与实现代码分离，更灵活）

定义Runnable接口的子类，实现run（）方法

### 线程的常用方法（基础）

getName（）、setName（）：获取设置线程名

start（）：启动线程

Thread.currentThread（）：获取当前线程名

Threawd.sleep(毫秒值)：线程暂停指定的毫秒时长

Thread.yield()

interrupt（）：打断另一个线程的暂停状态，被打断的线程，会出现InterruptedException

**setDaemon(true)：把线程设置成后台线程。**

虚拟机会在前台线程结束的前后左右，自动退出，不会等待后台线程退出。

**join（）：当前线程暂停，等待被调用的线程结束后，再继续执行**

setPriority（）：优先级

### 线程同步（重要）

让线程步调一致的执行；防止多个线程访问修改数据引起混乱。

多个线程共享数据时，一个线程修改数据，另一个线程的等待；

一个线程访问数据，修改线程也在等待。

synchronized关键字，java中每个实例，都有一个线程同步锁，多个线程，哪个线程抢到锁，那个线程可以修改或访问数据，其他得不到锁的线程，要暂停等待。

**synchronized（对象）{共享数据的访问或修改的代码}**

**synchronized(对象) {争夺指定对象的锁}**

**synchronized void f() {争夺当前对象的锁}**

**抢指定对象的锁，同一个类的不同的对象实例的锁，可能会冲突。如果抢类的锁，不同实例不会产生冲突。**

**static synchronized void f() {争夺“类对象“的锁}**

### 生产者消费者模型（重点）

**降低线程之间的耦合度，在相互两者之间产生一个数据容器来进行解耦合、隔离**

#### 线程间通信模型

通过中间的数据容器，来对线程进行解耦合

#### 等待和通知

Object的方法：

- wait（）
- notify（）
- notifyAll（）

**这三个方法必须同步，在synchronized的代码块内才能执行**

**等待和通知的对象，必须是加锁的对象**

**wait()外面总是一个循环条件判断，不应该只判断一次的if，防止醒来后没有数据崩溃退出，保证运行的安全稳定，需要一直判定是否有数据可以继续执行还是继续等待**

## 网络

Socket：插头，约定俗成套接字。

- 两台主机用IP地址可以找到对方
- 各自选择一个端口（提供服务，0~65535），进行连接
- 端口号：0~1024是常见服务的默认端口
- 5万以后系统保留端口，用来自动分配。
- 使用1024~50000之间的，去除常用软件服务所占用端口

### 服务器端

- 先选择一个端口，启动服务

    ss = new ServerSocket（8000）

- 在指定端口上等待客户端发起连接，建立连接

- 从插头对象，获得两个方向的流

    in = s.getInputStream()

### 客户端

- 向服务器发起连接，直接新建客户端的插头对象

- 从插头，获得两个方向的流

### 服务器端的阻塞操作

ss.accept（）：暂停，等待客户端发起的连接

in.read（）：接收数据，对方不发送数据会暂停等待

### 服务器端线程模型

服务线程（建立与客户端连接的线程）：循环执行accept（），等待下一客户端发送请求连接，并接收发送来的信息数据。

### 获得客户端IP地址

```java
private Socket s;
private String ip;

public TongXinThread(Socket s) {
    this.s = s;
    InetSocketAddress addr = (InetSocketAddress) s.getRemoteSocketAddress();
    this.ip = addr.getHostString();

}
```

### 接收数据的超时时间

socket.set

接收数据超时后，会出现超时异常



反射和注解















































