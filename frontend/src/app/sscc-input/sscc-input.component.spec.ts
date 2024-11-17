import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SsccInputComponent } from './sscc-input.component';

describe('SsccInputComponent', () => {
  let component: SsccInputComponent;
  let fixture: ComponentFixture<SsccInputComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SsccInputComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SsccInputComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
