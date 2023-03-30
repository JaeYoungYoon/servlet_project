function updateClock() {
  var now = new Date(); // 현재 시간을 가져옵니다.
  var hours = now.getHours(); // 시간을 가져옵니다.
  var minutes = now.getMinutes(); // 분을 가져옵니다.
  var seconds = now.getSeconds(); // 초를 가져옵니다.

  // 시간, 분, 초가 한 자리 숫자일 경우, 앞에 0을 붙여줍니다.
  hours = (hours < 10 ? "0" : "") + hours;
  minutes = (minutes < 10 ? "0" : "") + minutes;
  seconds = (seconds < 10 ? "0" : "") + seconds;

  // 시간을 HH:MM:SS 형식으로 표시합니다.
  var time = hours + ":" + minutes + ":" + seconds;

  // 시계를 업데이트합니다.
  document.getElementById("clock").innerHTML = time;
}

// 1초마다 시계를 업데이트합니다.
setInterval(updateClock, 1000);