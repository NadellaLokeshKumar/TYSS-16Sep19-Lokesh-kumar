import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';


@Directive ({
    selector : '[custDir]'
})


 export class CustomDirective {
    constructor(private el: ElementRef) {
        this.el.nativeElement.style.backgroundColor = 'red';
    }
    @HostBinding('style.backgroundColor') background = 'yellow';

    @HostListener('mouseenter') mouseEnterEvent() {
        this.el.nativeElement.style.backgroundColor = `brown`;
    }
        @HostListener('mouseleave') mouseLeaveEvent() {
            this.el.nativeElement.style.backgroundColor = `yellow`;
    }
}
