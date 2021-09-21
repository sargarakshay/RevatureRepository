import { StudentIdPipe } from './student-id.pipe';

describe('StudentIdPipe', () => {
  it('create an instance', () => {
    const pipe = new StudentIdPipe();
    expect(pipe).toBeTruthy();
  });
});
