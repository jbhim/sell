<html>
    <head>
        <meta charset="UTF-8">
        <title>卖家后台管理</title>
        <link href="https://cdn.bootcss.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
    </head>
<body>
    <#include "../common/hand.ftl">
    <br>
    <hr>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <form role="form" method="post" action="/sell/seller/product/save">
                    <div class="form-group">
                        <label>名称</label>
                        <input name="productName" type="text" class="form-control" value="${(productInfo.productName)!''}"/>
                    </div>

                    <div class="form-group">
                        <label>价格</label>
                        <input name="productPrice" type="text" class="form-control" value="${(productInfo.productPrice)!''}"/>
                    </div>

                    <div class="form-group">
                        <label>库存</label>
                        <input name="productStock" type="number" class="form-control" value="${(productInfo.productStock)!''}"/>
                    </div>

                    <div class="form-group">
                        <label>描述</label>
                        <input name="productDescription" type="text" class="form-control" value="${(productInfo.productDescription)!''}"/>
                    </div>

                    <div class="form-group">
                        <label>图片</label>
                        <img height="100" width="100" src="${(productInfo.productIcon)!''}" alt=""/>
                        <input name="productIcon" type="text" class="form-control" value="${(productInfo.productIcon)!''}"/>
                    </div>

                    <div class="form-group">
                        <label>类目</label>

                        <select name="categoryType" class="form-control">
                            <#list productCategories as category>
                                <option value="${category.categoryType}"
                                    <#if (productInfo.categoryType)?? && productInfo.categoryType == category.categoryType>
                                        SELECTED
                                    </#if>
                                >
                                    ${category.categoryName}
                                </option>
                            </#list>
                        </select>
                    </div>
                    <input hidden name="productId" value="${(productInfo.productId)!''}" type="text">

                    </div> <button type="submit" class="btn btn-default">提交</button>
                </form>
            </div>
        </div>
    </div>

</body>
</html>

