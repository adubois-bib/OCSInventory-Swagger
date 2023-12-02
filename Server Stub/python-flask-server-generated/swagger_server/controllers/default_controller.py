import connexion
import six

from swagger_server.models.computer_detail import ComputerDetail  # noqa: E501
from swagger_server.models.computers_list import ComputersList  # noqa: E501
from swagger_server.models.ipdiscover_list import IpdiscoverList  # noqa: E501
from swagger_server.models.ipdiscover_netdevices import IpdiscoverNetdevices  # noqa: E501
from swagger_server.models.list_of_id import ListOfID  # noqa: E501
from swagger_server.models.snmp_detail import SNMPDetail  # noqa: E501
from swagger_server.models.snmp_type import SNMPType  # noqa: E501
from swagger_server.models.softwares_list import SoftwaresList  # noqa: E501
from swagger_server import util


def computer_id_get(id):  # noqa: E501
    """Get a computer by its ID

     # noqa: E501

    :param id: ID of the computer in OCS database
    :type id: int

    :rtype: ComputersList
    """
    return 'do some magic!'


def computer_id_sections_get(id, sections, where=None, operator=None):  # noqa: E501
    """Get sections informations of a specific computer

     # noqa: E501

    :param id: ID of the computer in OCS database
    :type id: int
    :param sections: Name of the requested section (i.e -&gt; bios, software, etc..)
    :type sections: str
    :param where: Search on a specific column of the specific section.
    :type where: str
    :param operator: Search operator (like, not like, &#x3D;, !&#x3D;, &lt;, &gt;, &lt;&#x3D;, &gt;&#x3D;). Mandatory if where parameter is set.
    :type operator: str

    :rtype: ComputerDetail
    """
    return 'do some magic!'


def computers_get(start=None, limit=None):  # noqa: E501
    """Get a list of computers with its detail

     # noqa: E501

    :param start: Start offset of the query
    :type start: int
    :param limit: Limit offset of the query
    :type limit: int

    :rtype: List[ComputersList]
    """
    return 'do some magic!'


def computers_lastupdate_timestamp_get(timestamp):  # noqa: E501
    """Get a ID list of computers update during the provided timestamp

     # noqa: E501

    :param timestamp: Timestamp of the number of days to count down from the current date. Optional.
    :type timestamp: int

    :rtype: List[ListOfID]
    """
    return 'do some magic!'


def computers_list_idget(start=None, limit=None):  # noqa: E501
    """Get a ID list of all computers in the OCS database

     # noqa: E501

    :param start: Start offset of the query
    :type start: int
    :param limit: Limit offset of the query
    :type limit: int

    :rtype: List[ListOfID]
    """
    return 'do some magic!'


def ipdiscover_get(start=None, limit=None):  # noqa: E501
    """List IPDiscover network list

     # noqa: E501

    :param start: Start offset of the query
    :type start: int
    :param limit: Limit offset of the query
    :type limit: int

    :rtype: IpdiscoverList
    """
    return 'do some magic!'


def ipdiscover_network_netid_get(netid):  # noqa: E501
    """Get list of network devices scanned on one network

     # noqa: E501

    :param netid: Start offset of the query
    :type netid: int

    :rtype: IpdiscoverNetdevices
    """
    return 'do some magic!'


def snmp_snmp_type_get(snmp_type, start=None, limit=None):  # noqa: E501
    """Get snmp device list of a specific snmp type

     # noqa: E501

    :param snmp_type: Name of the snmp type you want to list
    :type snmp_type: str
    :param start: Start offset of the query
    :type start: int
    :param limit: Limit offset of the query
    :type limit: int

    :rtype: SNMPDetail
    """
    return 'do some magic!'


def snmp_snmp_type_id_get(snmp_type, id):  # noqa: E501
    """Get a device from a snmp type with its ID

     # noqa: E501

    :param snmp_type: Name of the snmp type you want to list
    :type snmp_type: str
    :param id: Identifiant en base de données de l&#x27;équipement
    :type id: int

    :rtype: SNMPDetail
    """
    return 'do some magic!'


def snmps_type_list_get():  # noqa: E501
    """Get a SNMP type list

     # noqa: E501


    :rtype: SNMPType
    """
    return 'do some magic!'


def softwares_get(start=None, limit=None, soft=None):  # noqa: E501
    """Get software list from database

     # noqa: E501

    :param start: Start offset of the query
    :type start: int
    :param limit: Limit offset of the query
    :type limit: int
    :param soft: Name of the software you want to search (optional)
    :type soft: str

    :rtype: SoftwaresList
    """
    return 'do some magic!'
