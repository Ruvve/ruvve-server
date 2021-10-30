# RUVVE SERVER

<br /><br/>
최근 도로나 인도에 **전동 킥보드**가 많이 보이고 있지 않나요? <br/>
배달로 인한 오토바이의 수도 점점 증가하고 있어요.  <br/>
<br/>
이렇게 **개인형 이동수단**의 개체 수가 증가하면서 그에 따른 **사건/사고**들도 급격히 증가하고 있습니다.<br/>
Ruvve는 이러한 문제를 해결하기 위해 개발된 **개인형 이동수단 전용 네비게이션**이에요!<br/>
<br/>
Ruvve가 가진 다른 네비게이션 서비스와의 차별점이 두 가지 있는데요.<br/>
먼저, 딥러닝을 기반한 개체 추적으로 주행 중 장애물 탐지를 통해 알림을 주는 기능을 가집니다.<br/>
또, AR 뷰를 통해 흔히 길치라고 부르는 공간감 능력이 부족한 분들도 직과적인 뷰를 통해 쉽게 길찾기를 할 수 있어요!<br/>
<br/>
더 자세한 이야기는 아래 Notion 에 소개해두었습니다 😆<br/>
피드백과 질문은 언제나 환영입니다! 👉🏻 노션 "Feedback & Comment" Section에 달아주시면 됩니다 👀🔥

<p align="center">
<table align="center"><tr><td>
 <a href="https://ruvve.notion.site/Ruvve-27b333f612814d07aaa2f6e8090c0e90"><img alt="notion" title="Notion" src="https://img.shields.io/badge/-Notion-white?style=for-the-badge&logo=notion&logoColor=black"/></a>
 </td></tr></table>
 </p>
 
<br/><br/>
<p align="center">
<img alt="java-v12.0.1" src="https://img.shields.io/badge/java-v12.0.1-3f72af" />
<img alt="Spring Boot-2.4.5" src="https://img.shields.io/badge/spring boot-2.4.5-green.svg" />
<img alt="gradle-v4" src="https://img.shields.io/badge/gradle-6.4.1-aa96da" />
 
<br/><br/>
  
<img alt="Service Architecture" width="100%" src="https://user-images.githubusercontent.com/43839834/139537676-b12f6b77-fbee-4f5b-bd15-3bfd88803b41.png" />

<br/>

<p align="center">
<a href="https://github.com/Ruvve/ruvve-tracker"><img alt="ruvve-tracker" title="Ruvve Tracker" src="https://img.shields.io/badge/-Ruvve Tracker-grey?style=for-the-badge&logo=github&logoColor=white"/></a>
<a href="https://github.com/Ruvve/ruvve-iOS"><img alt="Ruvve iOS" title="Ruvve iOS" src="https://img.shields.io/badge/-Ruvve iOS-grey?style=for-the-badge&logo=github&logoColor=white"/></a>
</p>

<br/><br/>
  
### CICD - EC2 & Jenkins & S3 & CodeDeploy
<br/><br/>
<img alt="CICD Architecture" width="100%" src="https://user-images.githubusercontent.com/43839834/139537718-c0c07ee3-5624-461c-a1c4-551324656146.png" />


<!--

  
+-- local --+      +-- Github -+         +--- EC2 ---+         +---- S3 ---+             +---- EC2 ---+
|           |      |           |         |           |         |           |     AWS     |            |
|  spring   | push |  master   | Webhook |  Jenkins  |  Build  |    Jar    | Code Deploy | Run Server |
|   boot    | --- |   branch  |  ----  |   Build   |  ----  |   Update  |  --------  | with nohup |
|           |      |           |         |           |         |           |             |            |
+-----------+      +-----------+         +-----------+         +-----------+             +------------+


-->


<br/><br/>


# RUVVE 

#### Personal Mobility Navigation - Ruvve

 개인형 이동수단을 위한 전용 경로를 찾아 AR화면을 통한 길안내 서비스를 제공합니다. ML을 통한 사물인식 기술을 통해 주행 중 사고 요소를 사전 감지하고 사고를 미연에 방지할 수 있는 안전 서비스를 가지고 있습니다. 장애물 탐지 기능과 AR Navigation이라는 특징이 기존의 Navigation과의 차별점입니다.
 
<br/>

<p align="center">
<img alt="mockup" width="40%" src="https://user-images.githubusercontent.com/43839834/135746103-41e41f40-0fbf-415e-9a11-2a5c8ea34cab.png" />
</p>

<br/>

#### Why Ruvve? 
최근 뉴스 등에서 이슈가 되고 있는 전동 킥보드의 자전거 도로 주행 관련 법 개정에 이 지속적으로 이루어지고 있습니다. 이는 전동 킥보드를 규정에 벗어난 이용하고 있는 사용자들로 인해 많은 시민들의 안전에 위협을 주고 있고 있으며, 사용자 또한 다양한 안전사고에 노출되어 있는 것이 현실입니다. 이러한 사회적 문제해결에 AI와 IoT 기술을 통해 기여를 하고자 합니다.


<!-- <p align="center">
<img alt="mockup" width="80%" src="https://user-images.githubusercontent.com/43839834/137591087-c42d401a-dac9-487d-9a91-8ba6c4ec5536.png" />
</p> -->

<br/><br/>
