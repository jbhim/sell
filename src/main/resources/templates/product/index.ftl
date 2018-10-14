<html>
<#include "../common/header.ftl">
<body>
<div id="wrapper" class="toggled">
<#include "../common/nav.ftl">
    <div id="page-content-wrapper">
        <div class="container-fluid">
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
                        <img id="imgflag" height="100" width="100" src="${(productInfo.productIcon)!''}" alt="${(productInfo.productIcon)!'1'}"/>
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
</div>
<div
</body>
<script>
    (function(){
        var imgflag = document.getElementById('imgflag');
        console.log(imgflag.alt);
        if (imgflag.alt === '1'){
            console.log(imgflag.alt);
            imgflag.style.display = 'none';
        }
    })();

</script>
</html>

