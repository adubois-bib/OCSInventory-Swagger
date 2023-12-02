/**
 * OCS Inventory Rest API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *//* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent }                           from '@angular/common/http';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';

import { Observable }                                        from 'rxjs';

import { ComputerDetail } from '../model/computerDetail';
import { ComputersList } from '../model/computersList';
import { IpdiscoverList } from '../model/ipdiscoverList';
import { IpdiscoverNetdevices } from '../model/ipdiscoverNetdevices';
import { ListOfID } from '../model/listOfID';
import { SNMPDetail } from '../model/sNMPDetail';
import { SNMPType } from '../model/sNMPType';
import { SoftwaresList } from '../model/softwaresList';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class DefaultService {

    protected basePath = 'https://api.ocsinventory-ng.tld/ocsapi/v1';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
            this.basePath = basePath || configuration.basePath || this.basePath;
        }
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        for (const consume of consumes) {
            if (form === consume) {
                return true;
            }
        }
        return false;
    }


    /**
     * Get a computer by its ID
     * 
     * @param id ID of the computer in OCS database
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public computerIdGet(id: number, observe?: 'body', reportProgress?: boolean): Observable<ComputersList>;
    public computerIdGet(id: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<ComputersList>>;
    public computerIdGet(id: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<ComputersList>>;
    public computerIdGet(id: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling computerIdGet.');
        }

        let headers = this.defaultHeaders;

        // authentication (basicAuth) required
        if (this.configuration.username || this.configuration.password) {
            headers = headers.set('Authorization', 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password));
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<ComputersList>('get',`${this.basePath}/computer/${encodeURIComponent(String(id))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get sections informations of a specific computer
     * 
     * @param id ID of the computer in OCS database
     * @param sections Name of the requested section (i.e -&gt; bios, software, etc..)
     * @param where Search on a specific column of the specific section.
     * @param operator Search operator (like, not like, &#x3D;, !&#x3D;, &lt;, &gt;, &lt;&#x3D;, &gt;&#x3D;). Mandatory if where parameter is set.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public computerIdSectionsGet(id: number, sections: string, where?: string, operator?: string, observe?: 'body', reportProgress?: boolean): Observable<ComputerDetail>;
    public computerIdSectionsGet(id: number, sections: string, where?: string, operator?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<ComputerDetail>>;
    public computerIdSectionsGet(id: number, sections: string, where?: string, operator?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<ComputerDetail>>;
    public computerIdSectionsGet(id: number, sections: string, where?: string, operator?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling computerIdSectionsGet.');
        }

        if (sections === null || sections === undefined) {
            throw new Error('Required parameter sections was null or undefined when calling computerIdSectionsGet.');
        }



        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (where !== undefined && where !== null) {
            queryParameters = queryParameters.set('where', <any>where);
        }
        if (operator !== undefined && operator !== null) {
            queryParameters = queryParameters.set('operator', <any>operator);
        }

        let headers = this.defaultHeaders;

        // authentication (basicAuth) required
        if (this.configuration.username || this.configuration.password) {
            headers = headers.set('Authorization', 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password));
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<ComputerDetail>('get',`${this.basePath}/computer/${encodeURIComponent(String(id))}/${encodeURIComponent(String(sections))}`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get a list of computers with its detail
     * 
     * @param start Start offset of the query
     * @param limit Limit offset of the query
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public computersGet(start?: number, limit?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<ComputersList>>;
    public computersGet(start?: number, limit?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<ComputersList>>>;
    public computersGet(start?: number, limit?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<ComputersList>>>;
    public computersGet(start?: number, limit?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {



        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (start !== undefined && start !== null) {
            queryParameters = queryParameters.set('start', <any>start);
        }
        if (limit !== undefined && limit !== null) {
            queryParameters = queryParameters.set('limit', <any>limit);
        }

        let headers = this.defaultHeaders;

        // authentication (basicAuth) required
        if (this.configuration.username || this.configuration.password) {
            headers = headers.set('Authorization', 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password));
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<Array<ComputersList>>('get',`${this.basePath}/computers`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get a ID list of computers update during the provided timestamp
     * 
     * @param timestamp Timestamp of the number of days to count down from the current date. Optional.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public computersLastupdateTimestampGet(timestamp: number, observe?: 'body', reportProgress?: boolean): Observable<Array<ListOfID>>;
    public computersLastupdateTimestampGet(timestamp: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<ListOfID>>>;
    public computersLastupdateTimestampGet(timestamp: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<ListOfID>>>;
    public computersLastupdateTimestampGet(timestamp: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (timestamp === null || timestamp === undefined) {
            throw new Error('Required parameter timestamp was null or undefined when calling computersLastupdateTimestampGet.');
        }

        let headers = this.defaultHeaders;

        // authentication (basicAuth) required
        if (this.configuration.username || this.configuration.password) {
            headers = headers.set('Authorization', 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password));
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<Array<ListOfID>>('get',`${this.basePath}/computers/lastupdate/${encodeURIComponent(String(timestamp))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get a ID list of all computers in the OCS database
     * 
     * @param start Start offset of the query
     * @param limit Limit offset of the query
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public computersListIDGet(start?: number, limit?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<ListOfID>>;
    public computersListIDGet(start?: number, limit?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<ListOfID>>>;
    public computersListIDGet(start?: number, limit?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<ListOfID>>>;
    public computersListIDGet(start?: number, limit?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {



        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (start !== undefined && start !== null) {
            queryParameters = queryParameters.set('start', <any>start);
        }
        if (limit !== undefined && limit !== null) {
            queryParameters = queryParameters.set('limit', <any>limit);
        }

        let headers = this.defaultHeaders;

        // authentication (basicAuth) required
        if (this.configuration.username || this.configuration.password) {
            headers = headers.set('Authorization', 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password));
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<Array<ListOfID>>('get',`${this.basePath}/computers/listID`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * List IPDiscover network list
     * 
     * @param start Start offset of the query
     * @param limit Limit offset of the query
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public ipdiscoverGet(start?: number, limit?: number, observe?: 'body', reportProgress?: boolean): Observable<IpdiscoverList>;
    public ipdiscoverGet(start?: number, limit?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<IpdiscoverList>>;
    public ipdiscoverGet(start?: number, limit?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<IpdiscoverList>>;
    public ipdiscoverGet(start?: number, limit?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {



        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (start !== undefined && start !== null) {
            queryParameters = queryParameters.set('start', <any>start);
        }
        if (limit !== undefined && limit !== null) {
            queryParameters = queryParameters.set('limit', <any>limit);
        }

        let headers = this.defaultHeaders;

        // authentication (basicAuth) required
        if (this.configuration.username || this.configuration.password) {
            headers = headers.set('Authorization', 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password));
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<IpdiscoverList>('get',`${this.basePath}/ipdiscover`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get list of network devices scanned on one network
     * 
     * @param netid Start offset of the query
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public ipdiscoverNetworkNetidGet(netid: number, observe?: 'body', reportProgress?: boolean): Observable<IpdiscoverNetdevices>;
    public ipdiscoverNetworkNetidGet(netid: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<IpdiscoverNetdevices>>;
    public ipdiscoverNetworkNetidGet(netid: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<IpdiscoverNetdevices>>;
    public ipdiscoverNetworkNetidGet(netid: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (netid === null || netid === undefined) {
            throw new Error('Required parameter netid was null or undefined when calling ipdiscoverNetworkNetidGet.');
        }

        let headers = this.defaultHeaders;

        // authentication (basicAuth) required
        if (this.configuration.username || this.configuration.password) {
            headers = headers.set('Authorization', 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password));
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<IpdiscoverNetdevices>('get',`${this.basePath}/ipdiscover/network/${encodeURIComponent(String(netid))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get snmp device list of a specific snmp type
     * 
     * @param snmpType Name of the snmp type you want to list
     * @param start Start offset of the query
     * @param limit Limit offset of the query
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public snmpSnmpTypeGet(snmpType: string, start?: number, limit?: number, observe?: 'body', reportProgress?: boolean): Observable<SNMPDetail>;
    public snmpSnmpTypeGet(snmpType: string, start?: number, limit?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<SNMPDetail>>;
    public snmpSnmpTypeGet(snmpType: string, start?: number, limit?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<SNMPDetail>>;
    public snmpSnmpTypeGet(snmpType: string, start?: number, limit?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (snmpType === null || snmpType === undefined) {
            throw new Error('Required parameter snmpType was null or undefined when calling snmpSnmpTypeGet.');
        }



        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (start !== undefined && start !== null) {
            queryParameters = queryParameters.set('start', <any>start);
        }
        if (limit !== undefined && limit !== null) {
            queryParameters = queryParameters.set('limit', <any>limit);
        }

        let headers = this.defaultHeaders;

        // authentication (basicAuth) required
        if (this.configuration.username || this.configuration.password) {
            headers = headers.set('Authorization', 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password));
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<SNMPDetail>('get',`${this.basePath}/snmp/${encodeURIComponent(String(snmpType))}`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get a device from a snmp type with its ID
     * 
     * @param snmpType Name of the snmp type you want to list
     * @param id Identifiant en base de données de l&#x27;équipement
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public snmpSnmpTypeIdGet(snmpType: string, id: number, observe?: 'body', reportProgress?: boolean): Observable<SNMPDetail>;
    public snmpSnmpTypeIdGet(snmpType: string, id: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<SNMPDetail>>;
    public snmpSnmpTypeIdGet(snmpType: string, id: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<SNMPDetail>>;
    public snmpSnmpTypeIdGet(snmpType: string, id: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (snmpType === null || snmpType === undefined) {
            throw new Error('Required parameter snmpType was null or undefined when calling snmpSnmpTypeIdGet.');
        }

        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling snmpSnmpTypeIdGet.');
        }

        let headers = this.defaultHeaders;

        // authentication (basicAuth) required
        if (this.configuration.username || this.configuration.password) {
            headers = headers.set('Authorization', 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password));
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<SNMPDetail>('get',`${this.basePath}/snmp/${encodeURIComponent(String(snmpType))}/${encodeURIComponent(String(id))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get a SNMP type list
     * 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public snmpsTypeListGet(observe?: 'body', reportProgress?: boolean): Observable<SNMPType>;
    public snmpsTypeListGet(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<SNMPType>>;
    public snmpsTypeListGet(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<SNMPType>>;
    public snmpsTypeListGet(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        let headers = this.defaultHeaders;

        // authentication (basicAuth) required
        if (this.configuration.username || this.configuration.password) {
            headers = headers.set('Authorization', 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password));
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<SNMPType>('get',`${this.basePath}/snmps/typeList`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get software list from database
     * 
     * @param start Start offset of the query
     * @param limit Limit offset of the query
     * @param soft Name of the software you want to search (optional)
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public softwaresGet(start?: number, limit?: number, soft?: string, observe?: 'body', reportProgress?: boolean): Observable<SoftwaresList>;
    public softwaresGet(start?: number, limit?: number, soft?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<SoftwaresList>>;
    public softwaresGet(start?: number, limit?: number, soft?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<SoftwaresList>>;
    public softwaresGet(start?: number, limit?: number, soft?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {




        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (start !== undefined && start !== null) {
            queryParameters = queryParameters.set('start', <any>start);
        }
        if (limit !== undefined && limit !== null) {
            queryParameters = queryParameters.set('limit', <any>limit);
        }
        if (soft !== undefined && soft !== null) {
            queryParameters = queryParameters.set('soft', <any>soft);
        }

        let headers = this.defaultHeaders;

        // authentication (basicAuth) required
        if (this.configuration.username || this.configuration.password) {
            headers = headers.set('Authorization', 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password));
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<SoftwaresList>('get',`${this.basePath}/softwares`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
