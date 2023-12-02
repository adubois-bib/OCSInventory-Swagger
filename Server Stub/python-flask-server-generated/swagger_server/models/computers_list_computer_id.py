# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.computers_list_computer_id_accountinfo import ComputersListComputerIdAccountinfo  # noqa: F401,E501
from swagger_server.models.computers_list_computer_id_bios import ComputersListComputerIdBios  # noqa: F401,E501
from swagger_server import util


class ComputersListComputerId(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, accountinfo: List[ComputersListComputerIdAccountinfo]=None, batteries: List[str]=None, bios: List[ComputersListComputerIdBios]=None):  # noqa: E501
        """ComputersListComputerId - a model defined in Swagger

        :param accountinfo: The accountinfo of this ComputersListComputerId.  # noqa: E501
        :type accountinfo: List[ComputersListComputerIdAccountinfo]
        :param batteries: The batteries of this ComputersListComputerId.  # noqa: E501
        :type batteries: List[str]
        :param bios: The bios of this ComputersListComputerId.  # noqa: E501
        :type bios: List[ComputersListComputerIdBios]
        """
        self.swagger_types = {
            'accountinfo': List[ComputersListComputerIdAccountinfo],
            'batteries': List[str],
            'bios': List[ComputersListComputerIdBios]
        }

        self.attribute_map = {
            'accountinfo': 'accountinfo',
            'batteries': 'batteries',
            'bios': 'bios'
        }
        self._accountinfo = accountinfo
        self._batteries = batteries
        self._bios = bios

    @classmethod
    def from_dict(cls, dikt) -> 'ComputersListComputerId':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The computersList_computer_id of this ComputersListComputerId.  # noqa: E501
        :rtype: ComputersListComputerId
        """
        return util.deserialize_model(dikt, cls)

    @property
    def accountinfo(self) -> List[ComputersListComputerIdAccountinfo]:
        """Gets the accountinfo of this ComputersListComputerId.


        :return: The accountinfo of this ComputersListComputerId.
        :rtype: List[ComputersListComputerIdAccountinfo]
        """
        return self._accountinfo

    @accountinfo.setter
    def accountinfo(self, accountinfo: List[ComputersListComputerIdAccountinfo]):
        """Sets the accountinfo of this ComputersListComputerId.


        :param accountinfo: The accountinfo of this ComputersListComputerId.
        :type accountinfo: List[ComputersListComputerIdAccountinfo]
        """

        self._accountinfo = accountinfo

    @property
    def batteries(self) -> List[str]:
        """Gets the batteries of this ComputersListComputerId.


        :return: The batteries of this ComputersListComputerId.
        :rtype: List[str]
        """
        return self._batteries

    @batteries.setter
    def batteries(self, batteries: List[str]):
        """Sets the batteries of this ComputersListComputerId.


        :param batteries: The batteries of this ComputersListComputerId.
        :type batteries: List[str]
        """

        self._batteries = batteries

    @property
    def bios(self) -> List[ComputersListComputerIdBios]:
        """Gets the bios of this ComputersListComputerId.


        :return: The bios of this ComputersListComputerId.
        :rtype: List[ComputersListComputerIdBios]
        """
        return self._bios

    @bios.setter
    def bios(self, bios: List[ComputersListComputerIdBios]):
        """Sets the bios of this ComputersListComputerId.


        :param bios: The bios of this ComputersListComputerId.
        :type bios: List[ComputersListComputerIdBios]
        """

        self._bios = bios
