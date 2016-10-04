# MemoryMonitor

内存监控组件

## 预览

![]()

## 使用

### step1

引用aar包，最新版本链接：[]()

### step2

在Application的`onCreate`中调用`MemoryMonitor.getInstance().init(this)`进行初始化

### step3

在需要显示的地方调用

`MemoryMonitor.getInstance().start(FloatCurveView.MEMORY_TYPE_PSS)`或者`MemoryMonitor.getInstance().start(FloatCurveView.MEMORY_TYPE_HEAP)`

别忘了在不需要的时候停止它，通过调用`MemoryMonitor.getInstance().stop()`