**項目說明**
- renren-fast是一個輕量級的，前後端分離的Java快速開發平台，能快速開發項目並交付【接私活利器】
- 支持MySQL、Oracle、SQL Server、PostgreSQL等主流資料庫
- 前端地址：https://gitee.com/renrenio/renren-fast-vue
- 代碼產生器：https://gitee.com/renrenio/renren-generator

<br>
 

**具有如下特點**
- 友好的代碼結構及註釋，便於閱讀及二次開發
- 實現前後端分離，通過token進行資料交互，前端再也不用關注後端技術
- 靈活的權限控制，可控製到頁面或按鈕，滿足絕大部分的權限需求
- 頁面交互使用Vue2.x，極大的提高了開發效率
- 完善的代碼產生機制，可在線產生entity、xml、dao、service、vue、sql代碼，減少70%以上的開發任務
- 引入quartz定時任務，可動態完成任務的新增、修改、刪除、暫停、恢復及日誌查看等功能
- 引入API模板，根據token作為登入令牌，極大的方便了APP介面開發
- 引入Hibernate Validator校驗框架，輕鬆實現後端校驗
- 引入雲存儲服務，已支持：七牛雲、阿里雲、騰訊雲等
- 引入swagger文檔支持，方便編寫API介面文檔
<br>

**項目結構**
```
renren-fast
├─db 項目SQL語句
│
├─common 公共模組
│ ├─aspect 系統日誌
│ ├─exception 異常處理
│ ├─validator 後台校驗
│ └─xss XSS過濾
│
├─config 設定訊息
│
├─modules 功能模組
│ ├─app API介面模組(APP調用)
│ ├─job 定時任務模組
│ ├─oss 文件服務模組
│ └─sys 權限模組
│
├─RenrenApplication 項目啟動類
│
├──resources
│ ├─mapper SQL對應的XML文件
│ └─static 靜態資源

```
<br>

**如何交流、反饋、參與貢獻？ **
- 開發文檔：https://www.renren.io/guide
- Git倉庫：https://gitee.com/renrenio/renren-fast
- [人人開源社區](https://www.renren.io/community)：https://www.renren.io/community
- 官方QQ群：324780204、145799952
- 技術討論、二次開發等諮詢、問題和建議，請移步到人人開源社區，我會在第一時間進行解答和回复！
- 如需關注項目最新動態，請Watch、Star項目，同時也是對項目最好的支持
- 微信掃碼並關注【人人開源】，獲得項目最新動態及更新提醒

<br>

![輸入圖片說明](https://images.gitee.com/uploads/images/2019/0307/090140_260d672d_63154.jpeg "在這裡輸入圖片標題")

<br>


**技術選型：**
- 核心框架：Spring Boot 2.1
- 安全框架：Apache Shiro 1.4
- 視圖框架：Spring MVC 5.0
- 持久層框架：MyBatis 3.3
- 定時器：Quartz 2.3
- 資料庫連線池：Druid 1.0
- 日誌管理：SLF4J 1.7、Log4j
- 頁面交互：Vue2.x
<br>


 **後端部署**
- 通過git下載源碼
- idea、eclipse需安裝lombok插件，不然會提示找不到entity的get set方法
- 建立資料庫renren_fast，資料庫編碼為UTF-8
- 執行db/mysql.sql文件，初始化資料
- 修改application-dev.yml，更新MySQL帳號和密碼
- Eclipse、IDEA運行RenrenApplication.java，則可啟動項目
- Swagger文檔路徑：http://localhost:8080/renren-fast/swagger/index.html
- Swagger註解路徑：http://localhost:8080/renren-fast/swagger-ui.html

<br>

 **前端部署**
 - 本項目是前後端分離的，還需要部署前端，才能運行起來
 - 前端下載地址：https://gitee.com/renrenio/renren-fast-vue
 - 前端部署文檔：https://gitee.com/renrenio/renren-fast-vue/wikis/Home
 - 前端部署完畢，就可以訪問項目了，帳號：admin，密碼：admin
 
 <br>

 **項目演示**
- 演示地址：http://demo.open.renren.io/renren-fast
- 帳號密碼：admin/admin
<br>

**介面文檔效果圖：**
![輸入圖片說明](https://images.gitee.com/uploads/images/2018/0728/145341_73ba6f75_63154.jpeg "在這裡輸入圖片標題")

<br> <br> <br>


**效果圖：**
![輸入圖片說明](https://gitee.com/uploads/images/2018/0505/173115_d3c045ef_63154.jpeg "在這裡輸入圖片標題")
![輸入圖片說明](https://gitee.com/uploads/images/2018/0624/225728_b06f72b3_63154.jpeg "在這裡輸入圖片標題")
![輸入圖片說明](https://gitee.com/uploads/images/2018/0505/173140_79928d91_63154.jpeg "在這裡輸入圖片標題")
![輸入圖片說明](https://gitee.com/uploads/images/2018/0505/173151_12d065db_63154.jpeg "在這裡輸入圖片標題")

<br>