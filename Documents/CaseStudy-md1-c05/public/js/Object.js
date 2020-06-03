let Object = function (x, y, width, height, status) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.status = status;
    this.image = '';
    this.setStatus = function (number) {
        switch (number) {
            case 0:
                this.status = 'up';
                break;
            case 1:
                this.status = 'down';
                break;
            case 2:
                this.status = 'left';
                break;
            case 3:
                this.status = 'run';
                break;
            default:
                this.status = 'run';
        }
    };
    this.setTop = function (number) {
        this.y = number;
    }
    this.setX = function (x) {
        this.x = this.x + x;
    };

    this.setStyle = function (style) {
        this.x = style.x;
        this.y = style.y;
        this.width = style.width;
        this.height = style.height;
        this.image = style.image;
    }
};