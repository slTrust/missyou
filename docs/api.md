### API路径

> Banner

首页顶部轮播图 banenr
- http://localhost:8080/v1/banner/name/b-1

首页热销商品banner （左大图，右上下两张图）
- http://localhost:8080/v1/banner/name/b-2

> Spu

spu 概要信息
- http://localhost:8080/v1/spu/id/2/simplify

spu id不合法校验
- http://localhost:8080/v1/spu/id/-2/simplify

首页瀑布流 spu列表 支持分页
- http://localhost:8080/v1/spu/latest
- http://localhost:8080/v1/spu/latest?start=1&count=2

spu详情数据
- http://localhost:8080/v1/spu/id/2/detail

通过二级分类获取 spu的列表
- http://localhost:8080/v1/spu/by/category/32

通过首页六宫格快捷入口 获取 spu列表
- http://localhost:8080/v1/spu/by/category/2?is_root=true