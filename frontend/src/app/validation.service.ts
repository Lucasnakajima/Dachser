import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ValidationService {
  private apiUrl = 'http://localhost:8080/api/validate';

  constructor(private http: HttpClient) { }

  validateSSCC(sscc: string): Observable<string> {
    const params = new HttpParams().set('sscc', sscc);
    return this.http.post(this.apiUrl, null, { params, responseType: 'text' }).pipe(
      map(response => response)
    );
  }
}
