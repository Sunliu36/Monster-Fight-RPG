MONSTER FIGHT RPG
===
「遊玩方式」
---
1. 下載整個repo
2. 開啟eclipse（或你自己喜好的ide,這裡以eclipse為例）
3. File -> Import -> General -> Existing Projects into Workspace -> Select root directory -> 選擇這個repo的地址 -> 選單最下方按finish
4. 在Package Explorer找到MonsterGame資料夾 -> src -> main -> Main.java -> 視窗最上面按下Run
5. 開始遊玩 Have Fun !!!

I.	專題簡介
---
這學期學習到的JavaFX剛好可以做為畫面呈現，所以這次Project我們這組決定做一款RPG遊戲。RPG全名Role-Playing Game，遊戲中玩家會扮演角色進行遊玩，透過與敵人戰鬥升等、收集裝備。在monsterGame中我們使用簡易的計分系統，玩家擊敗不同等級的怪物會獲得不同的分數，模擬RPG遊戲特色。

II.	遊戲規則
---
遊戲目標是盡可能的擊殺所有怪物獲取分數並活過60秒，即為挑戰成功。
遊戲中，角色可選擇：

:::
-法師：血量少，普通攻擊力低，特殊技能-火焰龜派氣功：原地短暫集氣後發射有一定距離的超高攻擊力火球。
  
-騎士：血量高，普通攻擊力高，特殊技能-金鐘罩鐵布衫：原地在短暫時間內抵擋所有攻擊。
:::

  開頭選擇Play後可進行角色選擇，進入遊戲後開始60秒倒數計時，地圖會隨機產生隨機的怪物，怪物每次生成的數量隨著遊戲的進行而逐漸增加，並陸續加入更強的怪物至怪物隨機佇列，遊戲中會依序出現以下三種怪物：
  
:::
-史萊姆：速度一般，攻擊力低，擊殺分數100
   
-小恐龍：速度快，攻擊力一般，擊殺分數300
   
-青眼黃龍：速度慢，攻擊力高，擊殺分數500
:::

**玩家操作方式：**
> -移動：Up 往上走 Down往下走 Left往左走 Right往右走
> -動作：Q 普通攻擊 W 角色特殊技能
> -備註：玩家被怪物攻擊後會有1秒的無敵時間


III.	視窗介紹與功能(我們的project有大量音效，可以體驗一下)
---
**A.	選單畫面**
 
在此畫面中，可以選擇:
:::

	PLAY:	進入角色選擇介面(選擇角色會播放GIF檔)
	 

	HELP:	遊戲規則說明
	 

EXIT: 退出遊戲 
:::


**B.	遊戲主畫面**
 
在遊戲主畫面中，左上角會顯示角色剩餘血量，中間顯示剩餘時間，右上方顯示獲得分數。
**C.	GameOver畫面**
 
若是角色在60結束前死亡會顯示此畫面，可點選下方TRY AGAIN按鈕再遊玩一次。
**D.	Time’sUp 通關畫面**
 


IV.	結論
---
一款遊戲的起源、開發、測試到部屬，其實中間要注意的點還是蠻多的。為了有良好的遊戲體驗，許多細節都必須注意，像是角色與怪物間的平衡、遊戲動畫與音效的同步，都需要經過不斷的調整。透過這次project我們也學習到如何利用javaFX進行畫面呈現開發，未來要是有課餘時間，也希望能將這款遊戲開發的更完整。

V.	Reference
---

A.	選單畫面參考(該遊戲是飛船遊戲，與我們的RPG內容完全不一樣)JavaFX game Tutorial [SpaceRunner] [Lesson 0] - YouTube
新增音效，離開按鈕，選擇的角色會切換成gif檔適意選擇該角色
B.	素材來源
1.	角色、怪物
sparklinlabs/superpowers-asset-packs: CC0-licensed asset packs for your games (github.com)
2.	UI
Assets · Kenney
3.	地圖
https://kenney.nl/assets/tiny-town?fbclid=IwAR0ps5CsYcAO38Iw5VPPez94RK_zH18NFJSmCTdVNlvM_vpQR844Hc5mwJI
4.	音效
小森平的免費下載音效 (taira-komori.jpn.org)
英雄聯盟戰敗音效
小小兵笑聲
打臉音效
