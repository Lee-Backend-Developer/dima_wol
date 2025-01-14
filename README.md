<h1>동아방송예술대학교 WOL 프로그램</h1>

<p align="center">
  <br>
  <img src="images/common/logo-sample.jpeg">
  <br>
</p>

## 목차
<div id="toc">
<ul>
    <li><a href="#intro">소개</a></li>
    <li><a href="#learned">배운 점 & 아쉬운 점</a></li>
</ul>
</div>

## 프로젝트 소개

<div align="justify" id="intro">
컴퓨터실에서 여러 대의 컴퓨터를 하나씩 직접 전원을 켜는 일이 번거롭고 시간이 많이 걸린다고 느꼈습니다. 
그래서 좀 더 간편하게 해결할 방법을 고민하던 중, 프로그램을 이용해 컴퓨터들을 한 번에 원격으로 켤 수 있다면 훨씬 편리하겠다는 
생각이 들었습니다. 이 아이디어를 바탕으로, 사용자가 일일이 전원을 누르지 않고도 여러 대의 컴퓨터를 효율적으로 관리할 수 있는 프로그램을 만들어보게 되었습니다.
</div>

<p align="center">
GIF Images
</p>

<br>

<div id="stack">
    <h2>기술 스택</h2>
    <table>
        <tr>
        <td style="text-align: center"><strong>Java</strong></td>
        </tr>
        <tr>
        <td> <img src="./images/stack/java.svg"> </td>
        </tr>
    </table>
</div>
<br>

## 구현 기능

### wol 패킷 전송

- 소켓이용해서 wol 패킷을 전송하는 기능

### 동아방송대 건물 객체지향 구현

- 추상클래스, 상속 등을 이용해서 동아방송대 컴퓨터실 만듦
<br>

## 배운 점 & 아쉬운 점

<div id="learned">
<ul>
    <li>만약 컴퓨터가 다른 위치로 변경이 된다면 프로그램에서 수정 할 수 없는 문제가 있음</li>
    <ul>
      <li>컴퓨터실 호실에 맞게 텍스트파일을 만들어서 맥 주소를 가져오는 방식으로 문제 해결 예정</li>
    </ul>
    <li>WOL 구조에 대해서 알게됨</li>
    <li>객체지향 설계를 더 이해 할 수 있는 프로젝트 이였음</li>
    <li>인텔리제이에서 swing 디자이너로 작업을 했었는데 실행이 되지 않는 문제가 있었는데 이 문제는 노션으로 기록되있음</li>

</ul>

</div>

## 라이센스

MIT &copy; [NoHack](mailto:lbjp114@gmail.com)

<!-- Stack Icon Refernces -->

[js]: /images/stack/javascript.svg
[ts]: /images/stack/typescript.svg
[react]: /images/stack/react.svg
[node]: /images/stack/node.svg
[java]: /images/stack/java.svg
