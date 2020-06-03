const IMG_CAY_0 = new Image();
IMG_CAY_0.src = './public/image/Fence.png';
const IMG_CAY_1 = new Image();
IMG_CAY_1.src = './public/image/Plant-0.png';
const IMG_CAY_2 = new Image();
IMG_CAY_2.src = './public/image/Rock-0.png';
const IMG_CAY_3 = new Image();
IMG_CAY_3.src = './public/image/Rock-1.png';
const IMG_CAY_4 = new Image();
IMG_CAY_4.src = './public/image/Plant-1.png';
const IMG_CAY_5 = new Image();
IMG_CAY_5.src = './public/image/Rock-2.png';

function StyleCay(style) {
    switch (style) {
        case 0:
            return {
                x: 1100,
                y: 282,
                width: 195,
                height: 29,
                image: IMG_CAY_0,
            };
        case 1:
            return {
                x: 1100,
                y: 167,
                width: 142,
                height: 146,
                image: IMG_CAY_1,
            };
        case 2:
            return {
                x: 1100,
                y: 220,
                width: 38,
                height: 93,
                image: IMG_CAY_2,
            };
        case 3:
            return {
                x: 1100,
                y: 273,
                width: 59,
                height: 41,
                image: IMG_CAY_3,
            };
        case 4:
            return {
                x: 1100,
                y: 180,
                width: 127,
                height: 132,
                image: IMG_CAY_4,
            };
        case 5:
            return {
                x: 1100,
                y: 287,
                width: 46,
                height: 28,
                image: IMG_CAY_5,
            };
    }
}

let style1 = 0;
const tree = new Object(1100, 282, 195, 29, 'left');
const arrTree = [];
tree.setStyle(StyleCay(style1));
arrTree.push({...tree});