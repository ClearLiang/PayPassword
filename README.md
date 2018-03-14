## 效果图
![截图效果](https://github.com/DwayneZhang/PayPassword/blob/master/Screenshot/Screenshot_20180314-215919.jpg)

## 使用
```
 Bundle bundle = new Bundle();
 bundle.putString(PayFragment.EXTRA_CONTENT, "提现：¥ " + 100.00);
 PayFragment fragment = new PayFragment();
 fragment.setArguments(bundle);
 fragment.setPaySuccessCallBack(MainActivity.this);
 fragment.show(getSupportFragmentManager(), "Pay");

```
*注：如果报getSupportFragmentManager()方法找不到，将Activity继承AppCompatActivity或者FragmentActivity就行*

**博客地址：** [CSDN](http://blog.csdn.net/u012987393/article/details/79561613)