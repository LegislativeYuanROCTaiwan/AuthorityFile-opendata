# 立法院開放資料服務平台
「機關權威檔」、「法名稱權威檔」、「同義詞權威檔」API技術說明文件
## 零、開放資料適用之授權條款
https://data.gov.tw/license
## 壹、程式說明
### 一、JAVA程式命名原則
1.	action
ID+ 流水號(3位) + "Action"。
2.	Obj
ID+ 流水號(3位) + "Obj"。
3.	ObjList
ID+ 流水號(3位) + " ObjList"。
### 二、流水號編碼
機關權威檔:281、法名稱權威檔:301、同義詞權威檔:321

## 貳、內容說明
### 一、機關權威檔
#### （一）API程式代號：ID281Action
#### （二）資料集類別：其他類
#### （三）欄位名稱
1. institution：機關名稱
2. usedFor：非適用詞
3. institutionSynonym：機關同義詞
#### （四）詮釋資料說明：https://data.ly.gov.tw/getds.action?id=281
#### （五）API參數
1. institution：機關名稱
2. fileType：檔案類型
3. 檔案類型可為json、xml、csv、txt、xls。
#### （六）API範例：https://data.ly.gov.tw/odw/ID281Action.action?institution=財政部北區國稅局&fileType=csv
### 二、法名稱權威檔
#### （一）API程式代號：ID301Action
#### （二）資料集類別：其他類
#### （三）欄位名稱：
1. law：法名稱
2. usedFor：非適用詞
#### （四）詮釋資料：https://data.ly.gov.tw/getds.action?id=301
#### （五）API參數
1. law：法名稱
2. fileType：檔案類型
3. 檔案類型可為json、xml、csv、txt、xls。
#### （六）API範例：https://data.ly.gov.tw/odw/ID301Action.action?law=中華民國總統府組織法&fileType=csv
### 三、同義詞權威檔
#### （一）API程式代號：ID321Action
#### （二）資料集類別：其他類
#### （三）欄位名稱：
1. keyWord：關鍵詞
2. usedFor：同義詞
#### （四）詮釋資料：https://data.ly.gov.tw/getds.action?id=321
#### （五）API參數
1. keyWord：關鍵詞
2. fileType：檔案類型
3. 檔案類型可為json、xml、csv、txt、xls。
#### （六）API範例：https://data.ly.gov.tw/odw/ID321Action.action?keyWord=第十屆&fileType=csv
