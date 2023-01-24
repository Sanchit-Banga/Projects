var cells = document.querySelectorAll(".box");
var flag = true;
var grid = [null, null, null, null, null, null, null, null, null];

cells.forEach((boxs) => {
  boxs.addEventListener("click", () => {
    if (flag === true) {
      var txt = boxs.innerHTML - 1;
      grid[txt] = "X";
      boxs.innerHTML = "X";
      boxs.style.backgroundColor = "red";
      flag = false;
    } else {
      var txt = boxs.innerHTML - 1;
      grid[txt] = "O";
      boxs.innerHTML = "X";
      boxs.innerHTML = "O";
      boxs.style.backgroundColor = "blue";
      flag = true;
    }
    if (isGameOver() === true) {
      setTimeout(function () {
        if (flag === false) {
          alert("Player X wins");
        } else {
          alert("Player O wins");
        }
        window.location.reload();
      }, 500);
    }
  });
});

function isGameOver() {
  return rowExist() || colExist() || diagExist();
}
function rowExist() {
  if (grid[0] === "X" && grid[1] === "X" && grid[2] === "X") {
    return true;
  }
  if (grid[3] === "X" && grid[4] === "X" && grid[5] === "X") {
    return true;
  }
  if (grid[6] === "X" && grid[7] === "X" && grid[8] === "X") {
    return true;
  }

  if (grid[0] === "O" && grid[1] === "O" && grid[2] === "O") {
    return true;
  }
  if (grid[3] === "O" && grid[4] === "O" && grid[5] === "O") {
    return true;
  }
  if (grid[6] === "O" && grid[7] === "O" && grid[8] === "O") {
    return true;
  }

  return false;
}

function colExist() {
  if (grid[0] === "X" && grid[3] === "X" && grid[6] === "X") {
    return true;
  }
  if (grid[1] === "X" && grid[4] === "X" && grid[7] === "X") {
    return true;
  }
  if (grid[3] === "X" && grid[5] === "X" && grid[8] === "X") {
    return true;
  }

  if (grid[0] === "O" && grid[3] === "O" && grid[6] === "O") {
    return true;
  }
  if (grid[1] === "O" && grid[4] === "O" && grid[7] === "O") {
    return true;
  }
  if (grid[3] === "O" && grid[5] === "O" && grid[8] === "O") {
    return true;
  }
  return false;
}

function diagExist() {
  if (grid[0] === "X" && grid[4] === "X" && grid[8] === "X") {
    return true;
  }
  if (grid[2] === "X" && grid[4] === "X" && grid[6] === "X") {
    return true;
  }

  if (grid[0] === "O" && grid[4] === "O" && grid[8] === "O") {
    return true;
  }
  if (grid[2] === "O" && grid[4] === "O" && grid[6] === "O") {
    return true;
  }
  return false;
}
