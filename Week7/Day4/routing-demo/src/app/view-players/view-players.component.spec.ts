import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewPlayersComponent } from './view-players.component';

describe('ViewPlayersComponent', () => {
  let component: ViewPlayersComponent;
  let fixture: ComponentFixture<ViewPlayersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewPlayersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewPlayersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
