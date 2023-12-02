package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.SNMPDetail
import io.swagger.server.model.SNMPType
import io.swagger.server.model.computerDetail
import io.swagger.server.model.computersList
import io.swagger.server.model.ipdiscoverList
import io.swagger.server.model.ipdiscoverNetdevices
import io.swagger.server.model.listOfID
import io.swagger.server.model.softwaresList

class DefaultApi(
    defaultService: DefaultApiService,
    defaultMarshaller: DefaultApiMarshaller
) {
  import defaultMarshaller._

  lazy val route: Route =
    path() { (id) => 
      get {
        
          
            
              
                
                  defaultService.computerIdGet(id = id)
               
             
           
         
       
      }
    } ~
    path() { (id, sections) => 
      get {
        parameters("where".as[String].?, "operator".as[String].?) { (where, operator) =>
          
            
              
                
                  defaultService.computerIdSectionsGet(id = id, sections = sections, where = where, operator = operator)
               
             
           
         
        }
      }
    } ~
    path() { 
      get {
        parameters("start".as[Int].?, "limit".as[Int].?) { (start, limit) =>
          
            
              
                
                  defaultService.computersGet(start = start, limit = limit)
               
             
           
         
        }
      }
    } ~
    path() { (timestamp) => 
      get {
        
          
            
              
                
                  defaultService.computersLastupdateTimestampGet(timestamp = timestamp)
               
             
           
         
       
      }
    } ~
    path() { 
      get {
        parameters("start".as[Int].?, "limit".as[Int].?) { (start, limit) =>
          
            
              
                
                  defaultService.computersListIDGet(start = start, limit = limit)
               
             
           
         
        }
      }
    } ~
    path() { 
      get {
        parameters("start".as[Int].?, "limit".as[Int].?) { (start, limit) =>
          
            
              
                
                  defaultService.ipdiscoverGet(start = start, limit = limit)
               
             
           
         
        }
      }
    } ~
    path() { (netid) => 
      get {
        
          
            
              
                
                  defaultService.ipdiscoverNetworkNetidGet(netid = netid)
               
             
           
         
       
      }
    } ~
    path() { (snmpType) => 
      get {
        parameters("start".as[Int].?, "limit".as[Int].?) { (start, limit) =>
          
            
              
                
                  defaultService.snmpSnmpTypeGet(snmpType = snmpType, start = start, limit = limit)
               
             
           
         
        }
      }
    } ~
    path() { (snmpType, id) => 
      get {
        
          
            
              
                
                  defaultService.snmpSnmpTypeIdGet(snmpType = snmpType, id = id)
               
             
           
         
       
      }
    } ~
    path() { 
      get {
        
          
            
              
                
                  defaultService.snmpsTypeListGet()
               
             
           
         
       
      }
    } ~
    path() { 
      get {
        parameters("start".as[Int].?, "limit".as[Int].?, "soft".as[String].?) { (start, limit, soft) =>
          
            
              
                
                  defaultService.softwaresGet(start = start, limit = limit, soft = soft)
               
             
           
         
        }
      }
    }
}

trait DefaultApiService {

  def computerIdGet200(responsecomputersList: computersList)(implicit toEntityMarshallercomputersList: ToEntityMarshaller[computersList]): Route =
    complete((200, responsecomputersList))
  def computerIdGet401: Route =
    complete((401, "Authentication information is missing or invalid"))
  /**
   * Code: 200, Message: OK, DataType: computersList
   * Code: 401, Message: Authentication information is missing or invalid
   */
  def computerIdGet(id: Int)
      (implicit toEntityMarshallercomputersList: ToEntityMarshaller[computersList]): Route

  def computerIdSectionsGet200(responsecomputerDetail: computerDetail)(implicit toEntityMarshallercomputerDetail: ToEntityMarshaller[computerDetail]): Route =
    complete((200, responsecomputerDetail))
  def computerIdSectionsGet401: Route =
    complete((401, "Authentication information is missing or invalid"))
  /**
   * Code: 200, Message: OK, DataType: computerDetail
   * Code: 401, Message: Authentication information is missing or invalid
   */
  def computerIdSectionsGet(id: Int, sections: String, where: Option[String], operator: Option[String])
      (implicit toEntityMarshallercomputerDetail: ToEntityMarshaller[computerDetail]): Route

  def computersGet200(responsecomputersListarray: List[computersList])(implicit toEntityMarshallercomputersListarray: ToEntityMarshaller[List[computersList]]): Route =
    complete((200, responsecomputersListarray))
  def computersGet401: Route =
    complete((401, "Authentication information is missing or invalid"))
  /**
   * Code: 200, Message: OK, DataType: List[computersList]
   * Code: 401, Message: Authentication information is missing or invalid
   */
  def computersGet(start: Option[Int], limit: Option[Int])
      (implicit toEntityMarshallercomputersListarray: ToEntityMarshaller[List[computersList]]): Route

  def computersLastupdateTimestampGet200(responselistOfIDarray: List[listOfID])(implicit toEntityMarshallerlistOfIDarray: ToEntityMarshaller[List[listOfID]]): Route =
    complete((200, responselistOfIDarray))
  def computersLastupdateTimestampGet401: Route =
    complete((401, "Authentication information is missing or invalid"))
  /**
   * Code: 200, Message: OK, DataType: List[listOfID]
   * Code: 401, Message: Authentication information is missing or invalid
   */
  def computersLastupdateTimestampGet(timestamp: Int)
      (implicit toEntityMarshallerlistOfIDarray: ToEntityMarshaller[List[listOfID]]): Route

  def computersListIDGet200(responselistOfIDarray: List[listOfID])(implicit toEntityMarshallerlistOfIDarray: ToEntityMarshaller[List[listOfID]]): Route =
    complete((200, responselistOfIDarray))
  def computersListIDGet401: Route =
    complete((401, "Authentication information is missing or invalid"))
  /**
   * Code: 200, Message: OK, DataType: List[listOfID]
   * Code: 401, Message: Authentication information is missing or invalid
   */
  def computersListIDGet(start: Option[Int], limit: Option[Int])
      (implicit toEntityMarshallerlistOfIDarray: ToEntityMarshaller[List[listOfID]]): Route

  def ipdiscoverGet200(responseipdiscoverList: ipdiscoverList)(implicit toEntityMarshalleripdiscoverList: ToEntityMarshaller[ipdiscoverList]): Route =
    complete((200, responseipdiscoverList))
  def ipdiscoverGet401: Route =
    complete((401, "Authentication information is missing or invalid"))
  /**
   * Code: 200, Message: OK, DataType: ipdiscoverList
   * Code: 401, Message: Authentication information is missing or invalid
   */
  def ipdiscoverGet(start: Option[Int], limit: Option[Int])
      (implicit toEntityMarshalleripdiscoverList: ToEntityMarshaller[ipdiscoverList]): Route

  def ipdiscoverNetworkNetidGet200(responseipdiscoverNetdevices: ipdiscoverNetdevices)(implicit toEntityMarshalleripdiscoverNetdevices: ToEntityMarshaller[ipdiscoverNetdevices]): Route =
    complete((200, responseipdiscoverNetdevices))
  def ipdiscoverNetworkNetidGet401: Route =
    complete((401, "Authentication information is missing or invalid"))
  /**
   * Code: 200, Message: OK, DataType: ipdiscoverNetdevices
   * Code: 401, Message: Authentication information is missing or invalid
   */
  def ipdiscoverNetworkNetidGet(netid: Int)
      (implicit toEntityMarshalleripdiscoverNetdevices: ToEntityMarshaller[ipdiscoverNetdevices]): Route

  def snmpSnmpTypeGet200(responseSNMPDetail: SNMPDetail)(implicit toEntityMarshallerSNMPDetail: ToEntityMarshaller[SNMPDetail]): Route =
    complete((200, responseSNMPDetail))
  def snmpSnmpTypeGet401: Route =
    complete((401, "Authentication information is missing or invalid"))
  /**
   * Code: 200, Message: OK, DataType: SNMPDetail
   * Code: 401, Message: Authentication information is missing or invalid
   */
  def snmpSnmpTypeGet(snmpType: String, start: Option[Int], limit: Option[Int])
      (implicit toEntityMarshallerSNMPDetail: ToEntityMarshaller[SNMPDetail]): Route

  def snmpSnmpTypeIdGet200(responseSNMPDetail: SNMPDetail)(implicit toEntityMarshallerSNMPDetail: ToEntityMarshaller[SNMPDetail]): Route =
    complete((200, responseSNMPDetail))
  def snmpSnmpTypeIdGet401: Route =
    complete((401, "Authentication information is missing or invalid"))
  /**
   * Code: 200, Message: OK, DataType: SNMPDetail
   * Code: 401, Message: Authentication information is missing or invalid
   */
  def snmpSnmpTypeIdGet(snmpType: String, id: Int)
      (implicit toEntityMarshallerSNMPDetail: ToEntityMarshaller[SNMPDetail]): Route

  def snmpsTypeListGet200(responseSNMPType: SNMPType)(implicit toEntityMarshallerSNMPType: ToEntityMarshaller[SNMPType]): Route =
    complete((200, responseSNMPType))
  def snmpsTypeListGet401: Route =
    complete((401, "Authentication information is missing or invalid"))
  /**
   * Code: 200, Message: OK, DataType: SNMPType
   * Code: 401, Message: Authentication information is missing or invalid
   */
  def snmpsTypeListGet()
      (implicit toEntityMarshallerSNMPType: ToEntityMarshaller[SNMPType]): Route

  def softwaresGet200(responsesoftwaresList: softwaresList)(implicit toEntityMarshallersoftwaresList: ToEntityMarshaller[softwaresList]): Route =
    complete((200, responsesoftwaresList))
  def softwaresGet401: Route =
    complete((401, "Authentication information is missing or invalid"))
  /**
   * Code: 200, Message: OK, DataType: softwaresList
   * Code: 401, Message: Authentication information is missing or invalid
   */
  def softwaresGet(start: Option[Int], limit: Option[Int], soft: Option[String])
      (implicit toEntityMarshallersoftwaresList: ToEntityMarshaller[softwaresList]): Route

}

trait DefaultApiMarshaller {

  implicit def toEntityMarshallercomputersList: ToEntityMarshaller[computersList]

  implicit def toEntityMarshallercomputerDetail: ToEntityMarshaller[computerDetail]

  implicit def toEntityMarshallercomputersListarray: ToEntityMarshaller[List[computersList]]

  implicit def toEntityMarshallerlistOfIDarray: ToEntityMarshaller[List[listOfID]]

  implicit def toEntityMarshallerlistOfIDarray: ToEntityMarshaller[List[listOfID]]

  implicit def toEntityMarshalleripdiscoverList: ToEntityMarshaller[ipdiscoverList]

  implicit def toEntityMarshalleripdiscoverNetdevices: ToEntityMarshaller[ipdiscoverNetdevices]

  implicit def toEntityMarshallerSNMPDetail: ToEntityMarshaller[SNMPDetail]

  implicit def toEntityMarshallerSNMPDetail: ToEntityMarshaller[SNMPDetail]

  implicit def toEntityMarshallerSNMPType: ToEntityMarshaller[SNMPType]

  implicit def toEntityMarshallersoftwaresList: ToEntityMarshaller[softwaresList]

}

