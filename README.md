# LIMBOOOOBaseApp

我的独立开发app的基石，可直接在上面开发应用，已准备好基础工具



## 下载到本地之后请先做如下步骤

1. 到settings.gradle当中修改app名字
2. 修改包名
3. 修改主题名
4. 修改图标



## 提供如下功能



#### 1. build.gradle默认添加

已声明简单的apk输出名字和输出版本，必须在根目录下添加keystore.properties文件才能自动正确签名release应用，**请不要将此文件上传到git，会泄露您的密钥**

文件内容如下

```
storePassword=limbxxxx
keyPassword=limbxxxxx
keyAlias=limbxxxxx
storeFile=C:\\Users\\lion\\Desktop\\xxxx.jks
```



#### 2. 已添加Material Design3动态配色



#### 3. 默认图标

已删除默认图标，更改图标为一本蓝色的书，在drawable，名为my_launcher_icon，正确的是应该放在mipmap当中



#### 4. 已添加Fragivity

管理fragment，替代navigation

基本使用
navigator.push(XXX::class){ initAnimation()  argument = bundleof(xxx to xxx) }
mNavigator.pop()



#### 4. 已添加assets目录

可向内添加lottie的json动画



#### 5. 工具类

1. ActivityCollector：管理Activity的类，代码参考郭霖《第一行代码》

2. LogUtil：管理Log的工具类，能够不删Log就禁用部分或所有Log，代码参考郭霖《第一行代码》
3. ToastUtil：通过扩展函数实现字符串.showToast()
4. MainViewModel内有个简单的Log工具，同样是通过扩展函数，实现字符串.showLog()，更改同一级下的disableLog，就可以轻松禁用Log

#### 6. 提供选项自定义View

提供一个简单的选项自定义View：SettingMenuView，左边为图标，紧接着选项名字，右侧为箭头，都可选是否显示

DpUtil：实现dp和px的互转

#### 7. 可选依赖

有DataStore、Room、lottie、gson等



~~待实现：重载navigator，实现默认添加过渡动画~~

