const IMG_CLOUD_1  = new Image();
IMG_CLOUD_1.src="./public/image/Cloud-01.png";
const IMG_CLOUD_2  = new Image();
IMG_CLOUD_2.src="./public/image/Cloud-02.png";
const IMG_CLOUD_3  = new Image();
IMG_CLOUD_3.src="./public/image/Cloud-03.png";
const IMG_CLOUD_4  = new Image();
IMG_CLOUD_4.src="./public/image/Cloud-04.png";
const IMG_CLOUD_5  = new Image();
IMG_CLOUD_5.src="./public/image/Cloud-05.png";

function StyleCloud(style) {
    switch (style) {
        case 0:
            return {
                x: 1100,
                y: 50,
                width: 142,
                height: 76,
                image: IMG_CLOUD_1,
            };
        case 1:
            return {
                x: 1100,
                y: 20,
                width: 169,
                height: 89,
                image: IMG_CLOUD_2,
            };
        case 2:
            return {
                x: 1100,
                y: 75,
                width: 170,
                height: 49,
                image: IMG_CLOUD_3,
            };
        case 3:
            return {
                x: 1100,
                y: 10,
                width: 195,
                height: 85,
                image: IMG_CLOUD_4,
            };
        case 4:
            return {
                x: 1100,
                y: 55,
                width: 134,
                height: 68,
                image: IMG_CLOUD_5,
            };
    }
}

let style2 = 0;
const cloud = new Object(1100, 50, 142, 76, 'left');
const arrCloud = [];
cloud.setStyle(StyleCloud(style2));
arrCloud.push({...cloud});