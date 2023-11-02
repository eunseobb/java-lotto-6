# Mission 3 - 로또 🤑

## 🏅 당첨 조건

    - 1등: 6개 번호 일치 / 2,000,000,000원
    - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
    - 3등: 5개 번호 일치 / 1,500,000원
    - 4등: 4개 번호 일치 / 50,000원
    - 5등: 3개 번호 일치 / 5,000원

-----

## 👾 실행 방법

1. 로또를 구매할 금액을 입력한다.
2. 로또 당첨 번호를 입력한다.
3. 보너스 번호를 입력한다.
4. 당첨 결과를 확인한다.



-----

## 🙋 유저 입력

### &emsp;💵 로또 구매 금액

&emsp;&emsp; 🔸 로또를 구입할 금액을 1,000원 단위로 입력한다. 로또는 한 장에 1,000원이다.

&emsp;&emsp; 🔸 `camp.nextstep.edu.missionutils.Console`의 `readLine()`으로 입력받은 `String`을 정수로 변환한다.

&emsp;&emsp; 🚫 다음 경우에 `IllegalArgumentException`

```
1. 입력한 형식이 숫자가 아닐 때
2. 입력한 숫자가 음수일 때
3. 1000단위로 입력하지 않았을 때
```

### 🔢 당첨 번호

&emsp;&emsp; 🔸 로또 당첨 번호를 입력한다.  
&emsp;&emsp;&emsp;&emsp;당첨 번호는 중복되지 않는 1~45인 정수 6개를 입력받고 각 숫자는 쉼표(,)로 구분한다.

&emsp;&emsp; 🔸 `camp.nextstep.edu.missionutils.Console`의 `readLine()`으로 입력받은 `String`을 정수로 변환한다.

&emsp;&emsp;🚫 다음 경우에 `IllegalArgumentException`

```
1. 입력한 형식이 숫자가 아닐 때
2. 입력한 숫자가 음수일 때
3. 입력한 숫자가 1~45 범위를 벗어났을 때
4. 입력한 숫자의 개수가 6개가 아닐 때
5. 중복되는 숫자가 있을 때
```

### ✔️ 보너스 번호

&emsp;&emsp; 🔸 로또 당첨 번호를 입력한다.  
&emsp;&emsp;&emsp;&emsp;당첨 번호는 중복되지 않는 1~45인 정수 6개를 입력받고 각 숫자는 쉼표(,)로 구분한다.

&emsp;&emsp; 🔸 `camp.nextstep.edu.missionutils.Console`의 `readLine()`으로 입력받은 `String`을 정수로 변환한다.

&emsp;&emsp;🚫 다음 경우에 `IllegalArgumentException`

```
1. 입력한 형식이 숫자가 아닐 때
2. 입력한 숫자가 음수일 때
3. 입력한 숫자가 1~45 범위를 벗어났을 때
4. 입력한 숫자의 개수가 6개가 아닐 때
5. 중복되는 숫자가 있을 때
```


