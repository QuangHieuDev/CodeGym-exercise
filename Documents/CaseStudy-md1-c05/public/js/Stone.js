const IMG_STONE_00 = new Image();
IMG_STONE_00.src = './public/image/Stone-00.png';
const IMG_STONE_01 = new Image();
IMG_STONE_01.src = './public/image/Stone-02.png';
const IMG_STONE_02 = new Image();
IMG_STONE_02.src = './public/image/Stone-03.png';
const IMG_STONE_03 = new Image();
IMG_STONE_03.src = './public/image/Stone-04.png';
const IMG_STONE_04 = new Image();
IMG_STONE_04.src = './public/image/Stone-05.png';
const IMG_STONE_05 = new Image();
IMG_STONE_05.src = './public/image/Stone-06.png';
const IMG_STONE_06 = new Image();
IMG_STONE_06.src = './public/image/Stone-07.png';
const IMG_STONE_07 = new Image();
IMG_STONE_07.src = './public/image/Stone-08.png';
const IMG_STONE_08 = new Image();
IMG_STONE_08.src = './public/image/Stone-09.png';
const IMG_STONE_09 = new Image();
IMG_STONE_09.src = './public/image/Stone-11.png';
const IMG_STONE_10 = new Image();
IMG_STONE_10.src = './public/image/Stone-13.png';
const IMG_STONE_11 = new Image();
IMG_STONE_11.src = './public/image/Stone-14.png';

function StyleStone(style) {
    switch (style) {
        case 0:
            return {
                x: 1100,
                y: 235,
                width: 77,
                height: 82,
                image: IMG_STONE_00,
            };
        case 1:
            return {
                x: 1100,
                y: 230,
                width: 75,
                height: 90,
                image: IMG_STONE_01,
            };
        case 2:
            return {
                x: 1100,
                y: 230,
                width: 125,
                height: 89,
                image: IMG_STONE_02,
            };
        case 3:
            return {
                x: 1100,
                y: 230,
                width: 74,
                height: 93,
                image: IMG_STONE_03,
            };
        case 4:
            return {
                x: 1100,
                y: 227,
                width: 76,
                height: 92,
                image: IMG_STONE_04,
            };
        case 5:
            return {
                x: 1100,
                y: 235,
                width: 76,
                height: 85,
                image: IMG_STONE_05,
            };
        case 6:
            return {
                x: 1100,
                y: 245,
                width: 74,
                height: 77,
                image: IMG_STONE_06,
            };
        case 7:
            return {
                x: 1100,
                y: 230,
                width: 76,
                height: 87,
                image: IMG_STONE_07,
            };
        case 8:
            return {
                x: 1100,
                y: 240,
                width: 84,
                height: 87,
                image: IMG_STONE_08,
            };
        case 9:
            return {
                x: 1100,
                y: 235,
                width: 82,
                height: 90,
                image: IMG_STONE_09,
            };
        case 10:
            return {
                x: 1100,
                y: 230,
                width: 74,
                height: 95,
                image: IMG_STONE_10,
            };
        case 11:
            return {
                x: 1100,
                y: 227,
                width: 76,
                height: 97,
                image: IMG_STONE_11,
            };
    }
}

let style3 = 0;
const stone = new Object(1100, 255, 77, 67, 'left');
let arrStone = [];
stone.setStyle(StyleStone(style3));
arrStone.push({...stone});