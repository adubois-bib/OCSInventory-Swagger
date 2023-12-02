# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.computer_detail import ComputerDetail  # noqa: E501
from swagger_server.models.computers_list import ComputersList  # noqa: E501
from swagger_server.models.ipdiscover_list import IpdiscoverList  # noqa: E501
from swagger_server.models.ipdiscover_netdevices import IpdiscoverNetdevices  # noqa: E501
from swagger_server.models.list_of_id import ListOfID  # noqa: E501
from swagger_server.models.snmp_detail import SNMPDetail  # noqa: E501
from swagger_server.models.snmp_type import SNMPType  # noqa: E501
from swagger_server.models.softwares_list import SoftwaresList  # noqa: E501
from swagger_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_computer_id_get(self):
        """Test case for computer_id_get

        Get a computer by its ID
        """
        response = self.client.open(
            '/ocsapi/v1/computer/{id}'.format(id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_computer_id_sections_get(self):
        """Test case for computer_id_sections_get

        Get sections informations of a specific computer
        """
        query_string = [('where', 'where_example'),
                        ('operator', 'operator_example')]
        response = self.client.open(
            '/ocsapi/v1/computer/{id}/{sections}'.format(id=56, sections='sections_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_computers_get(self):
        """Test case for computers_get

        Get a list of computers with its detail
        """
        query_string = [('start', 56),
                        ('limit', 56)]
        response = self.client.open(
            '/ocsapi/v1/computers',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_computers_lastupdate_timestamp_get(self):
        """Test case for computers_lastupdate_timestamp_get

        Get a ID list of computers update during the provided timestamp
        """
        response = self.client.open(
            '/ocsapi/v1/computers/lastupdate/{timestamp}'.format(timestamp=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_computers_list_idget(self):
        """Test case for computers_list_idget

        Get a ID list of all computers in the OCS database
        """
        query_string = [('start', 56),
                        ('limit', 56)]
        response = self.client.open(
            '/ocsapi/v1/computers/listID',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ipdiscover_get(self):
        """Test case for ipdiscover_get

        List IPDiscover network list
        """
        query_string = [('start', 56),
                        ('limit', 56)]
        response = self.client.open(
            '/ocsapi/v1/ipdiscover',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ipdiscover_network_netid_get(self):
        """Test case for ipdiscover_network_netid_get

        Get list of network devices scanned on one network
        """
        response = self.client.open(
            '/ocsapi/v1/ipdiscover/network/{netid}'.format(netid=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_snmp_snmp_type_get(self):
        """Test case for snmp_snmp_type_get

        Get snmp device list of a specific snmp type
        """
        query_string = [('start', 56),
                        ('limit', 56)]
        response = self.client.open(
            '/ocsapi/v1/snmp/{snmp_type}'.format(snmp_type='snmp_type_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_snmp_snmp_type_id_get(self):
        """Test case for snmp_snmp_type_id_get

        Get a device from a snmp type with its ID
        """
        response = self.client.open(
            '/ocsapi/v1/snmp/{snmp_type}/{id}'.format(snmp_type='snmp_type_example', id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_snmps_type_list_get(self):
        """Test case for snmps_type_list_get

        Get a SNMP type list
        """
        response = self.client.open(
            '/ocsapi/v1/snmps/typeList',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_softwares_get(self):
        """Test case for softwares_get

        Get software list from database
        """
        query_string = [('start', 56),
                        ('limit', 56),
                        ('soft', 'soft_example')]
        response = self.client.open(
            '/ocsapi/v1/softwares',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
