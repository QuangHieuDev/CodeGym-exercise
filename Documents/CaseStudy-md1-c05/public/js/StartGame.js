function StartGame(y) {
    const rect = {x: 457, y: y, width: 110, heigth: 80};
    arrStone = [];
    arrStone.push({...stone});
    let click = (evt) => {
        if (evt.layerX > rect.x && evt.layerX < rect.x + rect.width && evt.layerY < rect.y + rect.heigth && evt.layerY > rect.y) {
            ctx.clearRect(0, 0, canvas.width, canvas.height);
            point = 0;
            geckoTop = 0;
            speed = 1;
            LoadImg();
            canvas.removeEventListener("click", click)
        }
    };


    canvas.addEventListener('click', click)
    ctx.beginPath();
    ctx.rect(rect.x, rect.y, rect.width, rect.heigth);
    ctx.fillStyle = 'rgba(225,225,225,0.5)';
    ctx.fill();
    ctx.lineWidth = 2;
    ctx.strokeStyle = 'red';
    ctx.stroke();
    ctx.closePath();
    ctx.font = '40pt Kremlin Pro Web';
    ctx.fillStyle = 'red';
    ctx.fillText('Start', 460, y + 50);

}