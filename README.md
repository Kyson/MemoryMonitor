# MemoryMonitor

内存监控组件，可以在应用debug版本设置开关，随时打开内存监控器，时时监控实际物理内存占用及堆内存的使用情况（堆内存的视图和AndroidStudio中的monitor是一样的）

## 预览

![mm_preview](https://github.com/Kyson/MemoryMonitor/blob/master/ART/mm_preview.gif)

## 使用

### step1

引用3个aar包，链接：

- [曲线图依赖库](https://github.com/Kyson/MemoryMonitor/blob/master/ART/curvechartlib-release.aar)
- [悬浮视图依赖库](https://github.com/Kyson/MemoryMonitor/blob/master/ART/floatcontainerlib-release.aar)
- [主包，内存监控器](https://github.com/Kyson/MemoryMonitor/blob/master/ART/memorymonitorlib-release.aar)

### step2

在Application的`onCreate`中调用`MemoryMonitor.getInstance().init(this)`进行初始化

### step3

在需要显示的地方调用

`MemoryMonitor.getInstance().start(FloatCurveView.MEMORY_TYPE_PSS)`或者`MemoryMonitor.getInstance().start(FloatCurveView.MEMORY_TYPE_HEAP)`

别忘了在不需要的时候停止它，通过调用`MemoryMonitor.getInstance().stop()`