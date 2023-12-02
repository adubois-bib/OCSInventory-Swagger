# coding: utf-8

"""
    OCS Inventory Rest API

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class ComputersList(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'computer_id': 'ComputersListComputerId'
    }

    attribute_map = {
        'computer_id': '{computer_id}'
    }

    def __init__(self, computer_id=None):  # noqa: E501
        """ComputersList - a model defined in Swagger"""  # noqa: E501
        self._computer_id = None
        self.discriminator = None
        if computer_id is not None:
            self.computer_id = computer_id

    @property
    def computer_id(self):
        """Gets the computer_id of this ComputersList.  # noqa: E501


        :return: The computer_id of this ComputersList.  # noqa: E501
        :rtype: ComputersListComputerId
        """
        return self._computer_id

    @computer_id.setter
    def computer_id(self, computer_id):
        """Sets the computer_id of this ComputersList.


        :param computer_id: The computer_id of this ComputersList.  # noqa: E501
        :type: ComputersListComputerId
        """

        self._computer_id = computer_id

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(ComputersList, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, ComputersList):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other